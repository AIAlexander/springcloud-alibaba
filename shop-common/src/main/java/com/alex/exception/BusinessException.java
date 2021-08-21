package com.alex.exception;

import com.alex.constant.Response;

/**
 * @author wsh
 * @date 2021-06-11
 *
 * 通用业务报错类
 */
public class BusinessException extends RuntimeException{

    private int code = -1;

    public BusinessException(int code, String msg){
        super(msg);
        this.code = code;
    }

    public BusinessException(String msg){
        super(msg);
    }

    public int getCode() {
        return code;
    }
}
