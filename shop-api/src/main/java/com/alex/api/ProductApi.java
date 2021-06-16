package com.alex.api;

import com.alex.constant.Response;
import com.alex.entity.Product;
import com.alex.vo.ProductVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wsh
 * @date 2021-06-15
 *
 * OpenFeign声明式接口的定义
 */
@RequestMapping("/product")
public interface ProductApi {

    @GetMapping("{productId}")
    ProductVO product(@PathVariable("productId") Long productId);

    @GetMapping
    Response list();
}