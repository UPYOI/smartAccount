package com.songyutong.smartaccount.adapter.http;

import com.songyutong.smartaccount.application.UserService;
import com.songyutong.smartaccount.client.dto.BaseResponse;
import com.songyutong.smartaccount.client.request.LoginRequest;
import com.songyutong.smartaccount.client.request.SignUpRequest;
import com.songyutong.smartaccount.util.LogMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 用户操作
 *
 * @author： Songyutong
 * @date： 2024/3/14
 */
@RestController
@RequestMapping(value = "user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @LogMethod(desc = "发送验证码")
    @PostMapping(value = "sendVerifyCode")
    public BaseResponse sendVerifyCode() {
        return null;
    }

    /**
     * 用户登录
     *
     * @return
     */
    @LogMethod(desc = "用户登录")
    @PostMapping(value = LoginRequest.LOGIN_URL)
    public BaseResponse login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }

    /**
     * 用户注册
     *
     * @return
     */
    @LogMethod(desc = "用户注册")
    @PostMapping(value = SignUpRequest.SIGNUP_URL)
    public BaseResponse signUp(@RequestBody SignUpRequest request) {
        return userService.signUp(request);
    }

}
