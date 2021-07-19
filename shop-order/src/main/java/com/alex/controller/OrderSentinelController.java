package com.alex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsh
 * @date 2021-07-03
 */
@RestController
@RequestMapping("order/sentinel")
public class  OrderSentinelController {

    @GetMapping("test1")
    public String test1(){
        return "sentinel test 1";
    }

    @GetMapping("test2")
    public String test2(){
        return "sentinel test 2";
    }
}
