package com.alex.vo;

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
public class OrderVO {

    private Long orderId;

    private Long userId;

    private String username;

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer orderNumber;

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
