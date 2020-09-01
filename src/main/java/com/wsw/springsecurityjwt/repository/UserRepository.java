package com.wsw.springsecurityjwt.repository;

import com.wsw.springsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author WangSongWen
 * @Date: Created in 15:38 2020/9/1
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
