package com.gx.pro.mapper;

import com.gx.pro.entity.Droleright;

public interface DrolerightMapper {
    int deleteByPrimaryKey(Integer rrid);

    int insert(Droleright record);

    int insertSelective(Droleright record);

    Droleright selectByPrimaryKey(Integer rrid);

    int updateByPrimaryKeySelective(Droleright record);

    int updateByPrimaryKey(Droleright record);
}