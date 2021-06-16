package com.alex.controller;

import com.alex.api.ProductApi;
import com.alex.constant.Response;
import com.alex.service.ProductService;
import com.alex.vo.ProductVO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wsh
 * @date 2021-06-09
 */
@RestController
@Slf4j
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ProductVO product(@PathVariable("productId") Long productId) {
        log.info("查询【productId：{}】的商品", productId);
        ProductVO product = productService.findByProductId(productId);
        log.info("查询成功，商品为：{}", JSON.toJSONString(product));
        return product;
    }

    @Override
    public Response list() {
        return Response.SUCCESS(productService.getProductList());
    }
}
