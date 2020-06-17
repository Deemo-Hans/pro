package com.gx.pro.mapper;

import com.gx.pro.entity.Duserrole;

public interface DuserroleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(Duserrole record);

    int insertSelective(Duserrole record);

    Duserrole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(Duserrole record);

    int updateByPrimaryKey(Duserrole record);
}