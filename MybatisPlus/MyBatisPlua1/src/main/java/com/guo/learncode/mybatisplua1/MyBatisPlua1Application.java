package com.guo.learncode.mybatisplua1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guo.learncode.mybatisplua1.mapper")
public class MyBatisPlua1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlua1Application.class, args);
    }

}
