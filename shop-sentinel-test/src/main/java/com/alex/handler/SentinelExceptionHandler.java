package com.alex.handler;

import com.alex.constant.Response;
import com.alex.enu.ResponseCode;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.fastjson.JSON;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author wsh
 * @date 2021-08-16
 *
 * Sentinel异常处理
 */
@Component
public class SentinelExceptionHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        Response response = new Response();
        //流控规则的处理
        if(e instanceof FlowException) {
            response.setCode(ResponseCode.FLOW_EXCEPTION.getCode());
            response.setMsg(ResponseCode.FLOW_EXCEPTION.getMsg());
        }
        //降级规则的处理
        else if(e instanceof DegradeException) {
            response.setCode(ResponseCode.DEGRADE_EXCEPTION.getCode());
            response.setMsg(ResponseCode.DEGRADE_EXCEPTION.getMsg());
        }
        //参数限流的处理
        else if(e instanceof ParamFlowException) {
            response.setCode(ResponseCode.PARAM_FLOW_EXCEPTION.getCode());
            response.setMsg(ResponseCode.PARAM_FLOW_EXCEPTION.getMsg());
        }
        //授权规则的处理
        else if(e instanceof AuthorityException) {
            response.setCode(ResponseCode.AUTHORITY_EXCEPTION.getCode());
            response.setMsg(ResponseCode.AUTHORITY_EXCEPTION.getMsg());
        }else {
            response.setCode(ResponseCode.SERVER_ERROR.getCode());
            response.setMsg(ResponseCode.SERVER_ERROR.getMsg());
        }
        httpServletResponse.getWriter().write(JSON.toJSONString(response));
    }
}
