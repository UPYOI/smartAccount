package com.songyutong.smartaccount.domain.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.songyutong.smartaccount.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/15
 */
@Component
public class UserDomainService extends ServiceImpl<UserMapper, User> {

    @Autowired
    private UserMapper userMapper;

    public User getUserByPhone(String phone) {
        return userMapper.getUserByPhone(phone);
    }

    public void addUser(User user) {
        userMapper.insert(user);
    }

}
