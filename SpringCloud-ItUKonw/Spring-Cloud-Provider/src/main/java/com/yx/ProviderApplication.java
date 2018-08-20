package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: SpringCloud-consumer-provider
 * @description:
 * @author: yaoxu
 * @create: 2018-08-18 18:35
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args) ;
        System.out.println("start======================");
    }
}
