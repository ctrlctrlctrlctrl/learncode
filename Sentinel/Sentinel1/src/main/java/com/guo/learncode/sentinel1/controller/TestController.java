package com.guo.learncode.sentinel1.controller;

import com.alibaba.csp.sentinel.AsyncEntry;
import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphO;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.guo.learncode.sentinel1.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Grant
 * @Date: 2022/3/7
 * @Description: com.guo.learncode.sentinel1.controller
 * @version: 1.0
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        try (Entry entry= SphU.entry("Hello")){
            return "Hello Sentinel";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "系统繁忙，请稍后";
    }

//    @PostConstruct
//    public void init(){
//        List<FlowRule> rules = new ArrayList<>();
//        FlowRule rule = new FlowRule();
//        rule.setResource("Hello");
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        rule.setCount(2);
//        rules.add(rule);
//        FlowRuleManager.loadRules(rules);
//    }

    @GetMapping("/boolean")
    public boolean returnBoolean(){
        if(SphO.entry("Sentinel-boolean")){
            try {
                System.out.println("Hello Sentinel"+Thread.currentThread().getName());
                return true;
            }finally {
                SphO.exit();
            }
        }else {
            System.out.println("系统繁忙，请稍后锤石"+Thread.currentThread().getName());
            return false;
        }
    }

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/asymc")
    public void asyn(){

        AsyncEntry asyncEntry =null;
        try {
            asyncEntry = SphU.asyncEntry("Sentinel_Async");
            asyncService.hello();
            System.out.println("异步测试");
        }catch (BlockException e){
            e.printStackTrace();
            System.out.println("系统繁忙请稍后再试");
        }finally {
            if(asyncEntry!=null){
                asyncEntry.exit();
            }
        }

    }


}
