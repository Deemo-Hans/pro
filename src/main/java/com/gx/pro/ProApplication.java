package com.gx.pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.gx.pro.mapper")
public class ProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProApplication.class, args);
    }

}
