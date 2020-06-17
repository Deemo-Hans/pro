package com.gx.pro.service.serviceimpl;

import com.gx.pro.entity.Duser;
import com.gx.pro.mapper.DuserMapper;
import com.gx.pro.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private DuserMapper duserMapper;
    /**
     * 获取用户名
     * @param duser
     * @return
     */
    @Override
    public Map getUserByName(Duser duser) {
        Duser user=duserMapper.selectByPrimaryKey(duser.getUsername());
        if(user!=null)
        {
            Map<String,Object> muser=new HashMap<>();
            muser.put("state",10000);
            muser.put("date",user);
            return muser;}
        else {
            Map<String,Object> muser=new HashMap<>();
            muser.put("state",10001);
            return muser;}
    }
}
