package com.alex.dao;

import com.alex.dto.OrderQueryDTO;
import com.alex.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wsh
 * @date 2021-06-09
 */
@Mapper
@Repository
public interface OrderMapper{

    void insertOrder(OrderQueryDTO orderQueryDTO);
}
