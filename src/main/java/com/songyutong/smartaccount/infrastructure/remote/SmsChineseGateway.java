package com.songyutong.smartaccount.infrastructure.remote;

import com.songyutong.smartaccount.domain.remote.SmsGateway;
import com.songyutong.smartaccount.util.RestTemplateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/16
 */
@Service
public class SmsChineseGateway implements SmsGateway {

    @Value("${sms-chinese.sms-key}")
    private String smsKey;

    @Value("${sms-chinese.sms-url}")
    private String smsUrl;

    public String sendVerifyMessage(String phone) {
        String verifyCode = "";

        return verifyCode;
    }

}
