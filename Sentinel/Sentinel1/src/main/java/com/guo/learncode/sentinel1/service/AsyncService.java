package com.guo.learncode.sentinel1.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther: Grant
 * @Date: 2022/3/7
 * @Description: com.guo.learncode.sentinel1.service
 * @version: 1.0
 */
@Service
public class AsyncService {

    @Async
    public void hello(){
        System.out.println("异步调用开始===="+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("异步调用结束====");
    }
}
