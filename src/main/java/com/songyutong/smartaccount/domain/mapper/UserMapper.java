package com.songyutong.smartaccount.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.songyutong.smartaccount.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： Songyutong
 * @date： 2024/3/15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getUserByPhone(@Param("phone") String phone);

}
