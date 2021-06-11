package com.alex.service.impl;

import com.alex.dao.ProductMapper;
import com.alex.entity.Product;
import com.alex.service.ProductService;
import com.alex.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsh
 * @date 2021-06-09
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductVO findByProductId(Long productId) {
        List<ProductVO> productByProductId = productMapper.getProductByProductId(productId);
        return productByProductId.get(0);
    }

    @Override
    public List<ProductVO> getProductList() {
        List<ProductVO> list = productMapper.getProductList();
        return list;
    }
}
