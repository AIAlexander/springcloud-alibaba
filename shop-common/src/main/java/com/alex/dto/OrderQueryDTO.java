package com.alex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author wsh
 * @date 2021-06-11
 *
 * 查询order订单的dto
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderQueryDTO {

    private Long orderId;

    private Long userId;

    private String username;

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer orderNumber;

    @Override
    public String toString() {
        return "OrderQueryDTO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
