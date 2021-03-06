package com.youbc.securities.handlers;

import com.youbc.securities.services.CookieService;
import com.youbc.securities.services.JWTTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    private final JWTTokenService tokenService;
    private final CookieService cookieService;

    @Autowired
    public LoginSuccessHandler(JWTTokenService tokenService, CookieService cookieService) {
        this.tokenService = tokenService;
        this.cookieService = cookieService;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.addCookie(cookieService.createAuthCookie(tokenService.generateLongLiveToken(authentication.getName())));
    }
}
