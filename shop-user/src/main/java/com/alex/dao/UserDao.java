package com.alex.dao;

import com.alex.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wsh
 * @date 2021-06-09
 */
public interface UserDao extends JpaRepository<User, Long> {
}
