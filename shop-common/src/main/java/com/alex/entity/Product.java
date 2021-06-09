package com.alex.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author wsh
 * @date 2021-06-09
 *
 * 商品
 */
@Entity(name = "shop_product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer stock;
}
