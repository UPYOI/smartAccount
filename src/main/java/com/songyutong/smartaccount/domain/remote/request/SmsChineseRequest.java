package com.songyutong.smartaccount.domain.remote.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/16
 */
@Data
public class SmsChineseRequest {

    /**
     * 本站用户名
     */
    @JSONField(name = "Uid")
    private String uid;

    /**
     * 接口安全秘钥
     */
    @JSONField(name = "Key")
    private String key;

    /**
     * 手机号码
     */
    @JSONField(name = "smsMob")
    private String smsMob;

    /**
     * 短信内容
     */
    @JSONField(name = "smsText")
    private String smsText;
}
