package com.wzn.structurespring.exception;

import lombok.Getter;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-31 13:10
 * @description 全局异常响应返回值定义
 */

@Getter //只要getter方法，无需setter
public class APIException extends RuntimeException {
    private int code;
    private String msg;

    public APIException(String msg) {
        this(1001, msg);
    }

    private APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

}
