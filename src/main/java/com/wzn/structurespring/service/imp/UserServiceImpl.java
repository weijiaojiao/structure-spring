package com.wzn.structurespring.service.imp;

import com.wzn.structurespring.exception.APIException;
import com.wzn.structurespring.entity.User;
import com.wzn.structurespring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-31 11:57
 * @description 用户对象处理接口具体实现逻辑
 */

@Service
public class UserServiceImpl implements UserService {
    /**
     * 新增用户
     * @param user 用户对象
     * @return 新增用户对象数据
     */
    @Override
    public User addUser(User user) {
        if (user.getAge() < 18)
            throw new APIException("该用户未成年");
        return user;
    }
}
