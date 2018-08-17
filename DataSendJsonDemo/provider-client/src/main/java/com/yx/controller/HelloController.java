package com.yx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: DataSendJsonDemo
 * @description: HelloController
 * @author: yaoxu
 * @create: 2018-08-16 21:43
 **/
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(getClass()) ;

    public String select1(String json){
        logger.info("SpringCloud-Feign-Server >>>>> method---->select1:"+json) ;
        return "SpringCloud-Feign-Server >>>>> method---->select1:"+json ;
    }
}
