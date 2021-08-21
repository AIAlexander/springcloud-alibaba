package com.alex.client;

import com.alex.fallback.ProductServiceFallbackFactory;
import com.alex.vo.ProductVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wsh
 * @date 2021-06-15
 *
 * OpenFeign声明式接口的定义
 */
//fallback指定feign接口的容错类
@FeignClient(value = "service-product", fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductClient {

    @GetMapping(value = "/product/{productId}")
    ProductVO product(@PathVariable("productId") Long productId);

}
