package com.huang.springboot.mapper;

import com.huang.springboot.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@Mapper
public interface MenuMapper {
    List<Menu> findMenu();
}
