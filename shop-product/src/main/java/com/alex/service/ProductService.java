package com.alex.service;

import com.alex.entity.Product;

/**
 * @author wsh
 * @date 2021-06-09
 */
public interface ProductService {

    Product findByProductId(Long productId);
}
