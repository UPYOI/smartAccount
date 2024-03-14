package com.songyutong.smartaccount.domain.remote;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/16
 */
public interface SmsGateway {

    String sendVerifyMessage(String phone);

}
