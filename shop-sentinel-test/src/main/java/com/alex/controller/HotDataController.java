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
 * 用于测试sentinel热点规则
 */
@RestController
@RequestMapping("/hot_data")
public class HotDataController {

    @SentinelResource(value = "hot_data_rule")
    @GetMapping("message1")
    public String message1(@RequestParam("id") Integer id, @RequestParam("age") Integer age){
        return "hello, " + id + ", age:" + age;
    }
}
