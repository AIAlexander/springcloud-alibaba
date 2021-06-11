package com.alex.dao;

import com.alex.entity.Product;
import com.alex.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wsh
 * @date 2021-06-09
 */

@Mapper
@Repository
public interface ProductMapper {

    List<ProductVO> getProductByProductId(@Param("id") Long id);

    List<ProductVO> getProductList();
}
