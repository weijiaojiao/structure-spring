package com.wzn.structurespring.controller;

import com.wzn.structurespring.entity.User;
import com.wzn.structurespring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-30 18:36
 * @description 处理用户对象数据接口
 */

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    UserService userService;

    /**
     *  新增用户对象接口
     * @param user 用户对象
     * @return 新增用户对象数据信息
     */
    @PostMapping("/addUser")
    public User addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

}
