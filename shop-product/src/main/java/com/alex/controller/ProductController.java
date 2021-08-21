package com.alex.controller;

import com.alex.api.ProductClient;
import com.alex.constant.Response;
import com.alex.service.ProductService;
import com.alex.vo.ProductVO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    public Response list() {
        return Response.SUCCESS(productService.getProductList());
    }

    @PostMapping("/test")
    public Response message(){
        return Response.SUCCESS("test");
    }

    //-------------------------------------OpenFeign接口----------------------------------------------

    @GetMapping("/{productId}")
    public ProductVO product(@PathVariable("productId") Long productId) {
        log.info("查询【productId：{}】的商品", productId);
        ProductVO product = productService.findByProductId(productId);
        log.info("查询成功，商品为：{}", JSON.toJSONString(product));
        return product;
    }
}
