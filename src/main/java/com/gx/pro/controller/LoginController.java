package com.gx.pro.controller;

import com.gx.pro.entity.Duser;
import com.gx.pro.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public Map login(Duser duser)
    {
        Map<String,Object> muser=loginService.getUserByName(duser);
        return muser;
    }
    @RequestMapping("/test")
    private String testPing()
    {
        return "hello world";
    }
}
