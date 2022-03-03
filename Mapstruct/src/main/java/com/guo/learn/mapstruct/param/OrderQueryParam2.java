package com.guo.learn.mapstruct.param;

import lombok.Data;

/**
 * @Auther: Grant
 * @Date: 2022/3/2
 * @Description: com.guo.learncode.learnmapstruct.param
 * @version: 1.0
 */
@Data
public class OrderQueryParam2 {
    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 收货人姓名/号码
     */
    private String receiverKeyword;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;



}
