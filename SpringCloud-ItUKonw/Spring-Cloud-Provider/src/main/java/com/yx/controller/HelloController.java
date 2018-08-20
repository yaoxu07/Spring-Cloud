package com.yx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud-consumer-provider
 * @description:
 * @author: yaoxu
 * @create: 2018-08-18 18:44
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello:"+name+",this is provider2 and first message!" ;
    }
}
