package com.example.cwgl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.cwgl.dao")
public class CwglApplication {

    public static void main(String[] args) {
        SpringApplication.run(CwglApplication.class, args);
    }

}
