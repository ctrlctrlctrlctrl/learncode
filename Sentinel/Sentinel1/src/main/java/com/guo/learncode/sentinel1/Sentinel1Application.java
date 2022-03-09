package com.guo.learncode.sentinel1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Sentinel1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sentinel1Application.class, args);
    }

}
