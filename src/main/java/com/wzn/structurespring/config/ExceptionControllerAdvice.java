package com.wzn.structurespring.config;

import com.wzn.structurespring.exception.APIException;
import com.wzn.structurespring.vo.ResultVO;
import com.wzn.structurespring.enums.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;

/**
 * @author wei zhenning
 * @version 1.0
 * @datetime 2020-07-31 12:54
 * @description 全局异常处理。
 * 首先，我们需要新建一个类，
 * 在这个类上加上@ControllerAdvice或@RestControllerAdvice注解，
 * 这个类就配置成全局处理类了。（这个根据你的Controller层用的是@Controller还是@RestController来决定）
 * 然后在类中新建方法，
 * 在方法上加上@ExceptionHandler注解并指定你想处理的异常类型，
 * 接着在方法内编写对该异常的操作逻辑，
 * 就完成了对该异常的全局处理！
 */

@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {

    /**
     *
     * @param e
     * @return
     */
    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        log.info("错误信息：",e);
        return new ResultVO<>(ResultCode.FAILED, e.getMsg());
    }

    /**
     * Valid校验参数异常信息抛出
     *
     * @param e 异常信息
     * @return 异常信息巨土说明
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 提取错误提示信息进行返回
        return new ResultVO<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

}
