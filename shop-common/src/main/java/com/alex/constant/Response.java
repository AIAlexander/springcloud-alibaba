package com.alex.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wsh
 * @date 2021-06-11
 *
 * ResultFul请求通用接口
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private int code;
    private String msg;
    private Object data;

    public static final int SUCCESS_CODE = 200;
    public static final int WARN_CODE = 300;
    public static final int AUTHENTICATION_ERROR_CODE = 5003;
    public static final int BUSINESS_ERROR_CODE = 5004;
    public static final int SERVER_ERROR_CODE = 5005;

    public static Response SUCCESS(Object data){
        return new Response(SUCCESS_CODE, "success", data);
    }

    public static Response ERROR(String msg){
        return new Response(SERVER_ERROR_CODE, msg, null);
    }

    public static Response WARN(String msg){
        return new Response(WARN_CODE, msg, null);
    }

    public static Response AUTHENTICATION_EXCEPTION(String msg){
        return new Response(AUTHENTICATION_ERROR_CODE, msg, null);
    }

    public static Response BUSINESS_EXCEPTION(String msg){
        return new Response(BUSINESS_ERROR_CODE, msg, null);
    }

    public static Response SERVER_ERROR(){
        return new Response(5005, "服务器异常", null);
    }
}
