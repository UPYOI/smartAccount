package com.songyutong.smartaccount.application;

import com.songyutong.smartaccount.client.dto.BaseResponse;
import com.songyutong.smartaccount.client.request.LoginRequest;
import com.songyutong.smartaccount.client.request.SignUpRequest;
import com.songyutong.smartaccount.domain.user.User;
import com.songyutong.smartaccount.domain.user.UserDomainService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/15
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDomainService userDomainService;

    /**
     * 用户登录
     *
     * @param req
     * @return
     */
    @Override
    public BaseResponse login(LoginRequest req) {
        BaseResponse response = new BaseResponse();
        // 根据手机号和验证码验证是否登录
        if (req.isPasswordLogin()) {
            User user = userDomainService.getUserByPhone(req.getPhone());
            Assertions.assertNotNull(user, "用户未注册");
            Assertions.assertEquals(user.getPassword(), req.getPassword(), "密码错误");
            response.setData(user);
            response.buildSuccess();
            return response;
        }
        return response;
    }

    @Override
    public BaseResponse signUp(SignUpRequest request) {
        BaseResponse response = new BaseResponse();
        Assertions.assertTrue(StringUtils.isNotBlank(request.getUsername())
                && StringUtils.isNotBlank(request.getPassword())
                && StringUtils.isNotBlank(request.getPhone()), "用户名、密码、手机号不能为空");
        User user = userDomainService.getUserByPhone(request.getPhone());
        Assertions.assertNull(user, "该手机号已经注册");

        user = new User();
        user.setPhone(request.getPhone());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        userDomainService.addUser(user);
        response.setData(user);
        response.buildSuccess();
        return response;
    }
}
