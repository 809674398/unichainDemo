package com.unichain.demo.pojo.error;

import com.unichain.framework.mvc.exception.code.Code;

/**
 * @program: ErrorCode
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-01 11:55
 **/
public enum  ErrorCode implements Code{
    TOKEN_EXPIRE("20017", "token已过期")
    ;

    private String code;
    private String message;

    ErrorCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
