package com.alex.service.impl;

import com.alex.client.ProductClient;
import com.alex.constant.Response;
import com.alex.dao.OrderMapper;
import com.alex.dto.OrderQueryDTO;
import com.alex.entity.Product;
import com.alex.exception.BusinessException;
import com.alex.service.OrderService;
import com.alex.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.BufferStrategy;
import java.util.Objects;

/**
 * @author wsh
 * @date 2021-06-09
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderDao;

    @Autowired
    private ProductClient productClient;

    @Override
    public void createOrder(OrderQueryDTO orderQueryDTO) {

        //调用Product服务来获取商品的信息
        ProductVO product = productClient.product(orderQueryDTO.getProductId());
        if(Objects.isNull(product)) {
            throw new BusinessException(String.format("商品【id=%s】不存在", orderQueryDTO.getProductId()));
        }
        log.info(String.format("商品为：%s", product));
        //组装order的数据
        orderQueryDTO.setProductId(product.getProductId());
        orderQueryDTO.setProductName(product.getProductName());
        orderQueryDTO.setProductPrice(product.getProductPrice());
        orderQueryDTO.setUserId(1L);
        orderQueryDTO.setUsername("alex");

        orderDao.insertOrder(orderQueryDTO);
    }
}
