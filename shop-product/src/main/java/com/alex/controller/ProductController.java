package com.alex.controller;

import com.alex.entity.Product;
import com.alex.service.ProductService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsh
 * @date 2021-06-09
 */
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{productId}")
    public Product product(@PathVariable("productId") Long productId) {
        log.info("查询【productId：{}】的商品", productId);
        Product product = productService.findByProductId(productId);
        log.info("查询成功，商品为：{}", JSON.toJSONString(product));
        return product;
    }
}
