package com.gx.pro.service;

import com.gx.pro.entity.Duser;

import java.util.Map;

public interface LoginService {
    /**
     * 获取用户
     * @param duser
     * @return Duser
     */
    public Map getUserByName(Duser duser);
}
