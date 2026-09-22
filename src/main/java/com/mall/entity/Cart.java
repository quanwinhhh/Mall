package com.mall.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Cart {
    private long cartId;
    private long userId;
    private long goodsId;
    private int number;
    private Date createTime;
    private Date updateTime;




}
