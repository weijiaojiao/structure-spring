package com.wzn.structurespring.service;

import com.wzn.structurespring.entity.User;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-31 11:55
 * @description 用户对象处理接口
 */
public interface UserService {

    /**
     * 新增用户
     * @param user 用户对象
     * @return 新增用户对象数据
     */
    User addUser(User user);

}
