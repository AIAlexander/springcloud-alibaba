package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wsh
 * @date 2021-07-19
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelTestApplication.class, args);
    }
}
