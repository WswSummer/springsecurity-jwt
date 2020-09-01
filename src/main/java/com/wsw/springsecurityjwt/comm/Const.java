package com.wsw.springsecurityjwt.comm;

/**
 * @Author WangSongWen
 * @Date: Created in 13:40 2020/9/1
 * @Description:
 */
public class Const {
    public static final long EXPIRATION_TIME = 432_000_000;     // 5天(以毫秒ms计)
    public static final String SECRET = "WswSecret";            // JWT密码
    public static final String TOKEN_PREFIX = "Bearer";         // Token前缀
    public static final String HEADER_STRING = "Authorization"; // 存放Token的Header Key
}
