package com.songyutong.smartaccount.application;

import com.songyutong.smartaccount.client.dto.BaseResponse;
import com.songyutong.smartaccount.client.request.LoginRequest;
import com.songyutong.smartaccount.client.request.SignUpRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/15
 */
public interface UserService {

    BaseResponse login(LoginRequest req);

    BaseResponse signUp(SignUpRequest request);
}
