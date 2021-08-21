package com.alex.controller;

import com.alex.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsh
 * @date 2021-07-19
 *
 * 流控配置在dashboard中
 */
@RestController
@RequestMapping("/sentinel-test")
public class SentinelController {

    @Autowired
    private MessageService messageService;

    /**
     * 最简单的流控配置
     * 根据QPS 单机阈值：3
     * @return
     */
    @GetMapping("/message1")
    public String message1() {
        return "message1";
    }

    /**
     * 用于Warm Up式的流控效果配置
     * @return
     */
    @GetMapping("/message2")
    public String message2(){
        return "message2";
    }

    /**
     * 用于排队等待流控效果配置
     * @return
     */
    @GetMapping("/message3")
    public String message3(){
        return "message3";
    }

    /**
     * 用于链路流控模式测试
     * @return
     */
    @GetMapping("/message4")
    public String message4() {
        return messageService.message("message 4");
    }

    /**
     * 用于链路流控模式测试
     * @return
     */
    @GetMapping("/message5")
    public String message5() {
        return messageService.message("message 5");
    }

}
