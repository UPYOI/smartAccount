package com.songyutong.smartaccount.domain.user;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 用户实体类
 *
 * @author： Songyutong
 * @date： 2024/3/15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @JSONField(name = "uid")
    @TableId(type = IdType.AUTO)
    private Integer uid;

    /**
     * 用户名
     */
    @JSONField(name = "username")
    private String username;

    /**
     * 用户密码
     */
    @JSONField(name = "password")
    private String password;

    /**
     * 手机号
     */
    @JSONField(name = "phone")
    private String phone;

    /**
     * 性别:0-女，1-男
     */
    @JSONField(name = "gender")
    private String gender;

    /**
     * 头像
     */
    @JSONField(name = "avatar")
    private String avatar;

    /**
     * 用户状态：0-停用，1-正常，2-删除
     */
    @JSONField(name = "status")
    private Integer status;

    /**
     *  创建时间
     */
    @JSONField(name = "created_time")
    private LocalDateTime createdTime;


    /**
     * 更新时间
     */
    @JSONField(name = "modified_time")
    private LocalDateTime modifiedTime;

}
