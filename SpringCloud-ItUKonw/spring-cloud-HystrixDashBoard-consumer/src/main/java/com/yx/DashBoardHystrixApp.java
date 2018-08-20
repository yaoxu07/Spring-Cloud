package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @program: SpringCloud-consumer-provider
 * @description:
 * @author: yaoxu
 * @create: 2018-08-18 20:17
 **/

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class DashBoardHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardHystrixApp.class,args) ;
    }
}
