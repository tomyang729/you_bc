package com.youbc.controllers;

import com.youbc.database.UserDAO;
import com.youbc.error_handling.YouBCException;
import com.youbc.models.WeChatUser;
import com.youbc.securities.services.JWTTokenService;
import com.youbc.services.wechat.WeChatOAuthService;
import com.youbc.services.wechat.WeChatService;
import com.youbc.utilities.Endpoints;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@PropertySource("classpath:configurations/wechat.properties")
public class LoginController {

    @Value("${frontend.redirect}")
    private String redirectURL;
    @Value("${wechat.oauth.enabled}")
    private boolean enableOauth;
    private JWTTokenService tokenService;
    private WeChatOAuthService weChatOAuthService;
    private UserDAO userDAO;
    private WeChatService weChatService;

    public LoginController(
            JWTTokenService tokenService,
            WeChatOAuthService weChatOAuthService,
            UserDAO userDAO,
            WeChatService weChatService
    ) {
        this.tokenService = tokenService;
        this.weChatOAuthService = weChatOAuthService;
        this.userDAO = userDAO;
        this.weChatService = weChatService;
    }

    @RequestMapping(value = Endpoints.WECHAT_OAUTH, method = RequestMethod.GET)
    public void wechatOAuth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accessGrant = request.getParameter("code");
        try {
            WeChatUser weChatUser;
            if (enableOauth) {
                weChatUser = weChatOAuthService.login(accessGrant);
            } else {
                weChatUser = new WeChatUser(
                        accessGrant,
                        accessGrant+"_nickname",
                        "1", "", "", "",
                        "https://avatars0.githubusercontent.com/u/13238492?s=400&u=7716e4db99ffa98e20544d42520538a0a1f9cb79&v=4",
                        ""
                );
            }
            if (!userDAO.userExists(weChatUser.getOpenid())) {
                userDAO.buildNewUser(
                        weChatUser.getOpenid(),
                        weChatService.migrateProfileImage(weChatUser.getHeadimgurl()),
                        weChatUser.getNickname(),
                        weChatUser.getSex()
                );
            }
            String loginToken = tokenService.generateShortLiveToken(weChatUser.getOpenid());
            response.sendRedirect(redirectURL+"?auth="+loginToken);
            // TODO: simplify catch clauses
        } catch (YouBCException e) {
            e.printStackTrace();
            response.sendRedirect(redirectURL+"?auth=fail&message="+e.getYouBCError().getError());
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(redirectURL+"?auth=fail&message="+e.getMessage());
        }
    }

}
