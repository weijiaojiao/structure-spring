package com.wzn.structurespring.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-30 18:32
 * @description 用户对象
 */

@Data
public class User {

    //编号
    @NotBlank(message = "用户id不能为空")
    private String id;

    //姓名
    @NotBlank(message = "用户姓名不能为空")
    private String name;

    //年龄
    @NotNull(message = "用户年龄不能为空")
    private int age;

    //性别
    @NotBlank(message = "用户性别不能为空")
    private String sex;
}
