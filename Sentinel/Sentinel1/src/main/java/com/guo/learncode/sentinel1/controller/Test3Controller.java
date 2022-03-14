package com.guo.learncode.sentinel1.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Grant
 * @Date: 2022/3/13
 * @Description: com.guo.learncode.sentinel1.controller
 * @version: 1.0
 */
@RestController
public class Test3Controller {

    @SentinelResource(value = "Sentinel_Ann",blockHandler = "exceptionHandler")
    @GetMapping("/ann")
    public String hello(){
        return  "Hello Sentinel";
    }

    public String exceptionHandler(BlockException ex){
        ex.printStackTrace();
        return "系统繁忙，请稍后";
    }

}
