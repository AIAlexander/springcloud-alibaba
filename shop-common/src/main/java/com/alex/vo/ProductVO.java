package com.alex.vo;

import com.alex.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author wsh
 * @date 2021-06-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer stock;

    @Override
    public String toString() {
        return "ProductVO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", stock=" + stock +
                '}';
    }
}
