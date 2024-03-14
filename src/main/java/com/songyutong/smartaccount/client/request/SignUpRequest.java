package com.songyutong.smartaccount.client.request;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/16
 */
@Data
public class SignUpRequest {

    public static final String SIGNUP_URL = "signUp";

    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

}
