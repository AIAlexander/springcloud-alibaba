package com.alex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wsh
 * @date 2021-06-09
 */
@SpringBootApplication
@MapperScan("com.alex.dao")
public class ShopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopProductApplication.class);
    }
}
