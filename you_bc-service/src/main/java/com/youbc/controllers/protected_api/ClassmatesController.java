package com.youbc.controllers.protected_api;

import com.youbc.database.LikeAndDislikeDao;
import com.youbc.error_handling.YouBCError;
import com.youbc.error_handling.YouBCException;
import com.youbc.models.candidate.BasicCandidate;
import com.youbc.pooling.UserPoolManager;
import com.youbc.pooling.WeightedStrategy;
import com.youbc.pooling.classmates.PoolingByLikesClassmates;
import com.youbc.pooling.classmates.PoolingRandomClassmates;
import com.youbc.securities.services.CookieService;
import com.youbc.utilities.Endpoints;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Set;

@RestController
public class ClassmatesController {

    private UserPoolManager userPoolManager;
    private CookieService cookieService;
    private LikeAndDislikeDao likeAndDislikeDao;

    public ClassmatesController(
            CookieService cookieService,
            PoolingRandomClassmates poolingRandomClassmates,
            PoolingByLikesClassmates poolingByLikesClassmates,
            LikeAndDislikeDao likeAndDislikeDao
    ) {
        this.cookieService = cookieService;
        this.likeAndDislikeDao = likeAndDislikeDao;
        // init userPoolManager
        ArrayList<WeightedStrategy> strategies = new ArrayList<>();
        strategies.add(new WeightedStrategy(poolingRandomClassmates, 0.7));
        strategies.add(new WeightedStrategy(poolingByLikesClassmates, 0.3));
        userPoolManager = new UserPoolManager(strategies);
    }

    @RequestMapping(path = Endpoints.CLASSMATE_CANDIDATES, method = RequestMethod.GET)
    public Set<BasicCandidate> getClassmateCandidates(HttpServletRequest request) {
        Integer amount = Integer.parseInt(request.getParameter("amount"));
        String gender = request.getParameter("gender");
        String userID = cookieService.getAuthenticatedUserId(request);
        if (amount <= 0) throw new YouBCException(new YouBCError(HttpStatus.BAD_REQUEST, "missing parameter", "\'amount\' value is missing in the query string"));
        if (gender == null) gender = "mix";
        return userPoolManager.poolUsers(userID, amount, gender);
    }

    @RequestMapping(path = Endpoints.LIKE_CLASSMATES, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void postLikeClassmates(HttpServletRequest request, @PathVariable("user_id") String likee) {
        String liker = cookieService.getAuthenticatedUserId(request);
        likeAndDislikeDao.classmatesLike(liker, likee);
    }

    @RequestMapping(path = Endpoints.DISLIKE_CLASSMATES, method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void postDislikeClassmates(HttpServletRequest request, @PathVariable("user_id") String dislikee) {
        String disliker = cookieService.getAuthenticatedUserId(request);
        likeAndDislikeDao.classmatesDislike(disliker, dislikee);
    }
}