package com.guo.learn.mapstruct.covert;

import com.guo.learn.mapstruct.entiry.Order;
import com.guo.learn.mapstruct.param.OrderQueryParam;
import com.guo.learn.mapstruct.param.OrderQueryParam2;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * @Auther: Grant
 * @Date: 2022/3/2
 * @Description: com.guo.learncode.learnmapstruct.covert
 * @version: 1.0
 */
@Mapper(componentModel = "spring")
public interface OrderCovertBasic {
    OrderCovertBasic INSTANCE = Mappers.getMapper(OrderCovertBasic.class);

    OrderQueryParam toVO1(Order source);
    Order fromVO1(OrderQueryParam param);

    OrderQueryParam2 toVO2(Order source);
    Order fromVO2(OrderQueryParam2 param);

}
