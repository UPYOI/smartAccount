package com.songyutong.smartaccount.client.request;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 登录请求类
 *
 * @author： Songyutong
 * @date： 2024/3/15
 */
@Data
public class LoginRequest {

    public static final String LOGIN_URL = "login";
    /**
     * 验证码登录类型
     */
    public static final String CODE_LOGIN = "1";
    /**
     * 密码登录类型
     */
    public static final String PASSWORD_LOGIN = "2";

    /**
     * 手机号
     */
    private String phone;

    /**
     * 验证码
     */
    private String verifyCode;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 登陆类型：1-验证码登录，2-密码登录
     */
    private String loginType;

    public boolean isPasswordLogin() {
        return PASSWORD_LOGIN.equals(loginType);
    }
}
