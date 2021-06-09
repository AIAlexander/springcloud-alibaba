package com.alex.dao;

import com.alex.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wsh
 * @date 2021-06-09
 */

public interface ProductDao extends JpaRepository<Product, Long> {
}
