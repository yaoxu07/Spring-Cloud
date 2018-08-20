package com.yx.controller;

import com.yx.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: SpringCloud-consumer-provider
 * @description:
 * @author: yaoxu
 * @create: 2018-08-18 20:25
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed 服务发生了熔断!";
    }
}
