package com.wsw.springsecurityjwt.controller;

import com.wsw.springsecurityjwt.entity.User;
import com.wsw.springsecurityjwt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 16:05 2020/9/1
 * @Description:
 */
@RestController
public class JwtAuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/authentication/login")
    public String createToken(String username, String password) {
        return authService.login(username, password);
    }

    @PostMapping("/authentication/register")
    public User register(User addedUser) {
        return authService.register(addedUser);
    }
}
