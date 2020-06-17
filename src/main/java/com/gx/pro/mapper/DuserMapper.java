package com.gx.pro.mapper;

import com.gx.pro.entity.Duser;

public interface DuserMapper {
    int deleteByPrimaryKey(String username);

    int insert(Duser record);

    int insertSelective(Duser record);

    Duser selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Duser record);

    int updateByPrimaryKey(Duser record);
}