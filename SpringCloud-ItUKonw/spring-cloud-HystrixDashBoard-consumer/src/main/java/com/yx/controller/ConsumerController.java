package com.yx.controller;

import com.yx.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-consumer-provider
 * @description: ConsumerController
 * @author: yaoxu
 * @create: 2018-08-11 16:26
 **/
@RestController
public class ConsumerController {


    @Autowired
    HelloRemote HelloRemote ;
    //将HelloRemote注入到controller层，像普通方法一样去调用即可


    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return HelloRemote.hello(name) ;
    }

}
