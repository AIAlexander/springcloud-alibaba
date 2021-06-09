package com.alex.dao;

import com.alex.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wsh
 * @date 2021-06-09
 */
public interface OrderDao extends JpaRepository<Order, Long> {
}
