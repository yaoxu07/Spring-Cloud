package com.yx.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: DataSendJsonDemo
 *
 * @description: HelloService
 *
 * @author: yaoxu
 *
 * @create: 2018-08-16 20:51
 **/
@FeignClient(value = "SpringCloud-Feign-Server")
@RequestMapping("/HelloController")
public interface HelloService {

    @RequestMapping(value = "/hello/select1",method = RequestMethod.POST,consumes = "application/json")
    String select1(@RequestParam("json") String json) ;
}
