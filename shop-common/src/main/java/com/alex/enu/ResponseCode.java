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
    NO_AUTHENTICATION(100, "没有权限"),

    /**
     * Sentinel相关 2xxx
     */
    FLOW_EXCEPTION(2000, "接口被限流"),

    DEGRADE_EXCEPTION(2001, "接口被降级"),

    PARAM_FLOW_EXCEPTION(2002, "参数限流异常"),

    AUTHORITY_EXCEPTION(2003, "接口被授权规则限流")
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
