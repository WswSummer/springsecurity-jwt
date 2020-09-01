package com.wsw.springsecurityjwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 16:11 2020/9/1
 * @Description:
 */
@RestController
public class TestController {
    // 测试普通权限
    @PreAuthorize("hasAuthority('ROLE_NORMAL')")
    @GetMapping( value="/normal/test")
    public String test1() {
        return "ROLE_NORMAL /normal/test接口调用成功！";
    }

    // 测试管理员权限
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping( value = "/admin/test")
    public String test2() {
        return "ROLE_ADMIN /admin/test接口调用成功！";
    }
}
