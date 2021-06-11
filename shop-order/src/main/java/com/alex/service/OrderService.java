package com.alex.service;

import com.alex.dto.OrderQueryDTO;

/**
 * @author wsh
 * @date 2021-06-09
 */
public interface OrderService {

    void createOrder(OrderQueryDTO orderQueryDTO);
}
