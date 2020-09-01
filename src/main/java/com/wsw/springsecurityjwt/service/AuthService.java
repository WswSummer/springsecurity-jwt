package com.wsw.springsecurityjwt.service;

import com.wsw.springsecurityjwt.entity.User;

/**
 * @Author WangSongWen
 * @Date: Created in 15:19 2020/9/1
 * @Description:
 */
public interface AuthService {
    User register(User userToAdd);

    String login(String username, String password);
}
