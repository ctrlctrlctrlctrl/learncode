package com.guo.learncode.hutool;

import lombok.Data;

/**
 * @Auther: Grant
 * @Date: 2022/3/2
 * @Description: com.guo.learncode.learnmapstruct.entiry
 * @version: 1.0
 */
@Data
public class Order {

    private Long id;

    private String orderSn;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderSn='" + orderSn + '\'' +
                ", receiverKeyword=" + receiverKeyword +
                ", status=" + status +
                ", orderType=" + orderType +
                ", sourceType=" + sourceType +
                '}';
    }

    /**
     * 收货人姓名/号码
     */
    private Integer receiverKeyword;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    private Integer orderType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    private Integer sourceType;

}
