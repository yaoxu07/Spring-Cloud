package com.yx.controller;

import com.alibaba.fastjson.JSONObject;
import com.yx.pojo.HelloPojo;
import com.yx.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: DataSendJsonDemo
 * @description: controller类
 * @author: yaoxu
 * @create: 2018-08-16 15:25
 **/

@RestController
@RequestMapping("/HelloController")
public class HelloController {
    private Logger logger  = LoggerFactory.getLogger(getClass());

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello1(@RequestHeader("username") String username,@RequestHeader("phone") String phone){
        HelloPojo helloPojo = new HelloPojo();
        helloPojo.setUsername(username);
        helloPojo.setPhone(phone);
//        String json = JSONObject.toJSON(helloPojo).toString();
        String json = JSONObject.toJSONString(helloPojo);
        return helloService.select1(json) ;
    }
}
