package com.alex.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsh
 * @date 2021-08-14
 *
 * 测试sentinel的服务降级
 */
@RestController
@RequestMapping("/degradation")
public class DegradationController {

    int i = 0;

    @SentinelResource(value = "degradation_message1")
    @GetMapping("/message1")
    public String message1() throws InterruptedException {
        Thread.sleep(1000);
        return "message1";
    }

    @SentinelResource(value = "degradation_exception_ration")
    @GetMapping("/message2")
    public String message2() {
        i++;
        //异常比例：0.333
        if(i % 3 == 0) {
            throw new RuntimeException("error");
        }
        return "message2";
    }

    @SentinelResource(value = "degradation_exception_num")
    @GetMapping("/message3")
    public String message3() {
        i++;
        if(i % 2 == 0) {
            throw new RuntimeException("error");
        }
        return "message3";
    }
}
