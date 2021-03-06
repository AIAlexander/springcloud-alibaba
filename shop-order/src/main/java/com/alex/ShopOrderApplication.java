package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wsh
 * @date 2021-06-09
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ShopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApplication.class);
    }
}
