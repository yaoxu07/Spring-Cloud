package com.yx.inter;

import java.io.Serializable;

/**
 * @program: DataSendJsonDemo
 * @description: HelloPojo
 * @author: yaoxu
 * @create: 2018-08-16 21:47
 **/
public class HelloPojo implements Serializable {
    private String username ;
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
