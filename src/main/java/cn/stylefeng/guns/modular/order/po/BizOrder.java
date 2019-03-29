package cn.stylefeng.guns.modular.order.po;

import lombok.Data;

import java.util.Date;


@Data
public class BizOrder {
    private Integer id;

    private String goodsName;

    private String place;

    private Date createTime;

    private String userName;

    private String userPhone;


}