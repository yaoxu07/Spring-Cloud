package com.yx.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: spring-cloud-consumer-provider
 *
 * @description: feign调用实现
 *
 * @author: yaoxu
 *
 * @create: 2018-08-11 16:55
 *
 * name:远程服务名，及spring.application.name配置的名称
 *
 * 此类中的方法和远程服务中controller中的方法名和参数需保持一致
 *
 **/


@FeignClient(name=  "spring-cloud-provider")//服务提供方的应用名字
public interface HelloRemote {
    //请求url：http：//127.0.0.1:9007/hello/name
    @RequestMapping(value = "/hello")
    public  String hello(@RequestParam(value = "name") String name);
}
