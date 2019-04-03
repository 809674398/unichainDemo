package com.unichain.demo.controller.excption;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.unichain.framework.mvc.controller.ResponseMessage;
import com.unichain.framework.mvc.exception.RestExceptionHandler;
import com.unichain.framework.mvc.exception.code.ControllerErrorCode;
import com.unichain.framework.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;

/**
 * @program: GlobalExceptionHandler
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-03 16:53
 **/
@Slf4j
@Component
public class GlobalExceptionHandler extends RestExceptionHandler{

    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private <T> ResponseMessage<T> violationExceptionHandler(ConstraintViolationException e) {
        log.error("---------> unknown error!", e);
        String message = e.getConstraintViolations().iterator().next().getMessage();
        return ResponseMessage.error(message);
    }
}
