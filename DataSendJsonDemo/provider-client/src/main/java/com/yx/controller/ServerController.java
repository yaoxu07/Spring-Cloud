package com.yx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: DataSendJsonDemo
 * @description: RestTemplate 测试报文通信
 * @author: yaoxu
 * @create: 2018-08-18 15:06
 **/
@RestController
public class ServerController {

    Logger logger = LoggerFactory.getLogger(ServerController.class) ;
    @GetMapping("/getMsg")
    public String getMsg(){
        return "this is product msg";
    }
}
