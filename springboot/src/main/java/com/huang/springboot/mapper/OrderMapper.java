package com.huang.springboot.mapper;

import com.huang.springboot.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@Mapper
public interface OrderMapper {
    void add(Order order);
}
