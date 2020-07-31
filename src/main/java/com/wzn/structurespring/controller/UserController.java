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
 * @description
 */

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

}
