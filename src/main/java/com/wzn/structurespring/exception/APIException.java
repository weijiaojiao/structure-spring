package com.wzn.structurespring.exception;

import lombok.Getter;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-31 13:10
 * @description
 */

@Getter //只要getter方法，无需setter
public class APIException extends RuntimeException{
        private int code;
        private String msg;

        public APIException() {
            this(1001, "接口错误");
        }

        public APIException(String msg) {
            this(1001, msg);
        }

        public APIException(int code, String msg) {
            super(msg);
            this.code = code;
            this.msg = msg;
        }

}
