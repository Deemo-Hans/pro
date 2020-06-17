package com.gx.pro.handler;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.ConnectException;

@ControllerAdvice
public class ExceptionHander {
    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    public String error()
    {
        return "<H1>数据库连接超时</H1>";
    }
}
