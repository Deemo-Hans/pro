package com.gx.pro.mapper;

import com.gx.pro.entity.Dbidding;

public interface DbiddingMapper {
    int deleteByPrimaryKey(Integer bidid);

    int insert(Dbidding record);

    int insertSelective(Dbidding record);

    Dbidding selectByPrimaryKey(Integer bidid);

    int updateByPrimaryKeySelective(Dbidding record);

    int updateByPrimaryKey(Dbidding record);
}