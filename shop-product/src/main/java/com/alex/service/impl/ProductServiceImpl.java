package com.alex.service.impl;

import com.alex.dao.ProductDao;
import com.alex.entity.Product;
import com.alex.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wsh
 * @date 2021-06-09
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByProductId(Long productId) {
        return productDao.findById(productId).get();
    }
}
