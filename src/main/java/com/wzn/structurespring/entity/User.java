package com.wzn.structurespring.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-30 18:32
 * @description
 */

@Data
public class User {

    //编号
    @NotNull(message = "用户id不能为空")
    private String id;

    //姓名
    private String name;

    //年龄
    private int age;

    //性别
    private String sex;
}
