package com.songyutong.smartaccount;

import com.alibaba.fastjson.JSONObject;
import com.songyutong.smartaccount.domain.mapper.UserMapper;
import com.songyutong.smartaccount.domain.remote.request.SmsChineseRequest;
import com.songyutong.smartaccount.domain.user.User;
import com.songyutong.smartaccount.util.RestTemplateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
class SmartAccountApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelect() {
//        String s = RestTemplateUtil.doGet("https://tenapi.cn/v2/yiyan", String.class);
//        System.out.println(s);
        SmsChineseRequest smsChineseRequest = new SmsChineseRequest();
        smsChineseRequest.setUid("upyoi");
        smsChineseRequest.setKey("9AC19B7D67076C2A44FFD50D2B9FAA44");
        smsChineseRequest.setSmsMob("18186065536");
        smsChineseRequest.setSmsText("您好，这是一条测试短信！");
        String s = RestTemplateUtil.doPostJson("https://utf8api.smschinese.cn/", smsChineseRequest, String.class);
        System.out.println(s);

    }




}
