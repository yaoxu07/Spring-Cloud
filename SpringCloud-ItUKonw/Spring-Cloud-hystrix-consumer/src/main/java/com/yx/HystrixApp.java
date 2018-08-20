package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: SpringCloud-consumer-provider
 * @description:
 * @author: yaoxu
 * @create: 2018-08-18 20:17
 **/

@SpringBootApplication
@EnableDiscoveryClient  //启用服务注册与发现
@EnableFeignClients   //启用feign进行远程调用
public class HystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApp.class,args) ;
    }
}
