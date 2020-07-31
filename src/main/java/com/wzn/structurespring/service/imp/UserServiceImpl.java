package com.wzn.structurespring.service.imp;

import com.wzn.structurespring.exception.APIException;
import com.wzn.structurespring.entity.User;
import com.wzn.structurespring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-31 11:57
 * @description
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User addUser(User user) {
        if (user.getAge() < 18)
            throw new APIException("该用户未成年");
        return user;
    }
}
