package com.alex.service.impl;

import com.alex.dao.OrderMapper;
import com.alex.dto.OrderQueryDTO;
import com.alex.entity.Product;
import com.alex.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wsh
 * @date 2021-06-09
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderDao;

    @Override
    public void createOrder(OrderQueryDTO orderQueryDTO) {

        //调用Product服务来获取商品的信息
        Product product = new Product();
        product.setProductId(orderQueryDTO.getProductId());

        //组装order的数据
        orderQueryDTO.setProductName(product.getProductName());
        orderQueryDTO.setUserId(1L);
        orderQueryDTO.setUsername("alex");

        orderDao.insertOrder(orderQueryDTO);
    }
}
