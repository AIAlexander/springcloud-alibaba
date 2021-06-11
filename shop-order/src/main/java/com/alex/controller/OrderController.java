package com.alex.controller;

import com.alex.constant.Response;
import com.alex.dto.OrderQueryDTO;
import com.alex.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsh
 * @date 2021-06-09
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @PostMapping
    public Response order(@RequestBody OrderQueryDTO orderQueryDTO) {
        orderService.createOrder(orderQueryDTO);
        return Response.SUCCESS(null);
    }

}
