package com.alex.constant;

import com.alex.enu.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wsh
 * @date 2021-06-11
 *
 * ResultFul请求通用接口
 */
public class Response {
    private int code;
    private String msg;
    private Object data;

    public Response() {
        this.code = ResponseCode.SUCCESS.getCode();
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Response SUCCESS(Object data){
        return new Response(ResponseCode.SUCCESS.getCode(),
                ResponseCode.SUCCESS.getMsg(), data);
    }

    public static Response ERROR(String msg){
        return new Response(ResponseCode.SERVER_ERROR.getCode(),
                ResponseCode.SERVER_ERROR.getMsg());
    }

    public static Response AUTHENTICATION_EXCEPTION(String msg){
        return new Response(ResponseCode.NO_AUTHENTICATION.getCode(),
                ResponseCode.NO_AUTHENTICATION.getMsg());
    }

    public Response msg(String msg) {
        this.msg = msg;
        return this;
    }

    public Response code(int code) {
        this.code = code;
        return this;
    }

    public Response data(Object data) {
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
