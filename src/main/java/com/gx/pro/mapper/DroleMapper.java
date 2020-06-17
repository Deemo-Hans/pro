package com.gx.pro.mapper;

import com.gx.pro.entity.Drole;

public interface DroleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Drole record);

    int insertSelective(Drole record);

    Drole selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Drole record);

    int updateByPrimaryKey(Drole record);
}