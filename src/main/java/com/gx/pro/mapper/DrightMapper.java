package com.gx.pro.mapper;

import com.gx.pro.entity.Dright;

public interface DrightMapper {
    int deleteByPrimaryKey(Integer rightid);

    int insert(Dright record);

    int insertSelective(Dright record);

    Dright selectByPrimaryKey(Integer rightid);

    int updateByPrimaryKeySelective(Dright record);

    int updateByPrimaryKey(Dright record);
}