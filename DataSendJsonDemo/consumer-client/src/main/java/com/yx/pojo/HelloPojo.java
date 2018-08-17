package com.yx.pojo;

import java.io.Serializable;

/**
 * @program: DataSendJsonDemo
 * @description: pojo implements Serializable
 * @author: yaoxu
 * @create: 2018-08-16 21:00
 **/
public class HelloPojo implements Serializable {
    private String username;
    private String phone ;

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

    public HelloPojo() {
    }

    @Override
    public String toString() {
        return "HelloPojo{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
