package com.alex.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsh
 * @date 2021-08-14
 *
 * 用于sentinel授权规则测试
 */
@RestController
@RequestMapping("/authority")
public class AuthorityController {


    @SentinelResource(value = "authority_rule")
    @GetMapping("message1")
    public String message1(@RequestParam("serviceName") String serviceName) {
        return serviceName + ", message1";
    }
}
