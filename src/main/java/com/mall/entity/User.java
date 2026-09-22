package com.mall.entity;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String password;
    private String nickName;
    private String phone;
    private String avatar;
    private Data createTime;
    private Data updateTime;
    private Integer status;


}
