package com.yx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: DataSendJsonDemo
 * @description: eureka启动类
 * @author: yaoxu
 * @create: 2018-08-15 20:44
 **/
@EnableEurekaServer
@SpringBootApplication
public class eurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication.class,args) ;
//        new SpringApplicationBuilder(eurekaApplication.class).web(true).run(args) ;
    }
}
