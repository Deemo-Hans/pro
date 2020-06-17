package com.gx.pro.mapper;

import com.gx.pro.entity.Dclient;

public interface DclientMapper {
    int deleteByPrimaryKey(String username);

    int insert(Dclient record);

    int insertSelective(Dclient record);

    Dclient selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Dclient record);

    int updateByPrimaryKey(Dclient record);
}