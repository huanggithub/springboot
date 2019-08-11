package com.huang.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.huang.springboot.pojo.Category;

@Mapper
public interface CategoryMapper {

 
    List<Category> findAll();


}