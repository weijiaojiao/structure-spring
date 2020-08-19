package com.wzn.structurespring.controller;

import com.wzn.structurespring.entity.User;
import com.wzn.structurespring.service.ProcessorService;
import com.wzn.structurespring.service.UserService;
import com.wzn.structurespring.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

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

    @Resource
    ProcessorService processorService;

    /**
     * 新增用户对象接口
     *
     * @param user 用户对象
     * @return 新增用户对象数据信息
     */
    @PostMapping("/addUser")
    public ResultVO<Object> addUser(@RequestBody @Valid User user) {
        return new ResultVO<>(userService.addUser(user));
    }

    /**
     * 通用流程处理
     */
    @PostMapping("/start")
    public ResultVO start(){
        return new ResultVO(processorService.start());
    }

}
