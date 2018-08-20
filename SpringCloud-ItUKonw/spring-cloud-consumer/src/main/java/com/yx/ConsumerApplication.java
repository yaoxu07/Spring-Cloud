package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: spring-cloud-consumer-provider
 * @description: ConsumerApplication
 * @author: yaoxu
 * @create: 2018-08-11 16:23
 **/
@SpringBootApplication
@EnableDiscoveryClient  //启用服务注册与发现
@EnableFeignClients   //启用feign进行远程调用
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args) ;
    }
}
