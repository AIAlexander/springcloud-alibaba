package com.alex.service;

import com.alex.entity.Product;
import com.alex.vo.ProductVO;

import java.util.List;

/**
 * @author wsh
 * @date 2021-06-09
 */
public interface ProductService {

    ProductVO findByProductId(Long productId);

    List<ProductVO> getProductList();
}
