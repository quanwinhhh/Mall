package com.mall.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Goods {
    private long goodsId;
    private long userId;
    private String title;
    private String description;
    private String price;
    private String originalPrice;
    private String coverImg;
    private String status;
    private Date createTime;
    private Date updateTime;



}
