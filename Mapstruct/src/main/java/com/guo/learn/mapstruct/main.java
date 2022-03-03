package com.guo.learn.mapstruct;


import com.guo.learn.mapstruct.covert.OrderCovertBasic;
import com.guo.learn.mapstruct.covert.UserCovertBasic;
import com.guo.learn.mapstruct.entiry.Order;
import com.guo.learn.mapstruct.entiry.User;
import com.guo.learn.mapstruct.param.OrderQueryParam;
import com.guo.learn.mapstruct.param.OrderQueryParam2;
import com.guo.learn.mapstruct.vo.UserVO1;
import com.guo.learn.mapstruct.vo.UserVO2;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Grant
 * @Date: 2022/3/2
 * @Description: com.guo.learncode.learnmapstruct
 * @version: 1.0
 */
public class main {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(12345L);
        order.setOrderSn("orderSn");
        order.setOrderType(0);
        order.setReceiverKeyword("keyword");
        order.setSourceType(1);
        order.setStatus(2);
        System.out.println("order原型："+order);

        OrderQueryParam vo1 = OrderCovertBasic.INSTANCE.toVO1(order);
        System.out.println("order转换vo1："+vo1);

        OrderQueryParam2 vo2 = OrderCovertBasic.INSTANCE.toVO2(order);
        System.out.println("order转换vo2："+vo2);

        order = OrderCovertBasic.INSTANCE.fromVO1(vo1);
        System.out.println("vo1转换order："+order);

        order = OrderCovertBasic.INSTANCE.fromVO2(vo2);
        System.out.println("vo2转换order："+order);


    }

//    public static void main(String[] args) {
//        User user = User.builder()
//                .id(1)
//                .name("张三")
//                .createTime("2020-04-01 11:05:07")
//                .updateTime(LocalDateTime.now())
//                .build();
//        List<Object> objectList = new ArrayList<>();
//
//        objectList.add(user);
//
//        // 使用mapstruct
//        UserVO1 userVO1 = UserCovertBasic.INSTANCE.toConvertVO1(user);
//        objectList.add("userVO1:" + UserCovertBasic.INSTANCE.toConvertVO1(user));
//        objectList.add("userVO1转换回实体类user:" + UserCovertBasic.INSTANCE.fromConvertEntity1(userVO1));
//        // 输出转换结果
//        objectList.add("userVO2:" + " | " + UserCovertBasic.INSTANCE.toConvertVO2(user));
//        // 使用BeanUtils
//        UserVO2 userVO22 = new UserVO2();
//        BeanUtils.copyProperties(user, userVO22);
//        objectList.add("userVO22:" + " | " + userVO22);
//    }
}
