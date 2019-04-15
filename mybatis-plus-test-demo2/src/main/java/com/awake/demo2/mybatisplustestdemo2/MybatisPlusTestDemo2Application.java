package com.awake.demo2.mybatisplustestdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.awake.demo2.mybatisplustestdemo2.sys.mapper")
@SpringBootApplication
public class MybatisPlusTestDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusTestDemo2Application.class, args);
    }

}
