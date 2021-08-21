package com.alex.service.impl;

import com.alex.service.MessageService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author wsh
 * @date 2021-08-14
 */
@Service
public class MessageServiceImpl implements MessageService {

    //定义流控资源的名称
    @SentinelResource(value = "message")
    @Override
    public String message(String msg) {
        return  "hello, " + msg;
    }
}
