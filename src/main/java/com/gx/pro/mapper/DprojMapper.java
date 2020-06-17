package com.gx.pro.mapper;

import com.gx.pro.entity.Dproj;

public interface DprojMapper {
    int deleteByPrimaryKey(String projid);

    int insert(Dproj record);

    int insertSelective(Dproj record);

    Dproj selectByPrimaryKey(String projid);

    int updateByPrimaryKeySelective(Dproj record);

    int updateByPrimaryKey(Dproj record);
}