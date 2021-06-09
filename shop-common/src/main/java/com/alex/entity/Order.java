package com.alex.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author wsh
 * @date 2021-06-09
 *
 * 订单
 */
@Entity(name = "shop_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String username;

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer number;
}
