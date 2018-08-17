package com.yx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: DataSendJsonDemo
 * @description: FeignServerApplication
 * @author: yaoxu
 * @create: 2018-08-16 21:36
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class FeignServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerApplication.class,args) ;
    }
}
