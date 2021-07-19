package com.alex.enu;

/**
 * @author wsh
 * @date 2021-07-19
 *
 * 响应参数枚举类
 */
public enum  ResponseCode {
    SUCCESS(0, "成功"),
    SERVER_ERROR(50, "系统错误"),

    /**
     * 权限相关 1xx
     */
    NO_AUTHENTICATION(100, "没有权限")
    ;

    int code;

    String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
