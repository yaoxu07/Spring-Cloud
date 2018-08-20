package com.yx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: DataSendJsonDemo
 * @description: 编写客户端，用于测试报文传输
 * @author: yaoxu
 * @create: 2018-08-18 15:18
 **/
@RestController
public class ClientController {

    Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){

        String response = restTemplate.getForObject( "http://SpringCloud-Feign-Server/getMsg", String.class);  // 通过应用名进行访问
        logger.info("response = {}" , response);
        return response;
    }
  /*  @GetMapping("/getProductMsg")
    public String getProductMsg() {

        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("SpringCloud-Feign-Server");  // serviceId 为提供服务的应用名
        logger.info("Hsot=",serviceInstance.getHost());
        logger.info("port",serviceInstance.getPort());
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort() + "/getMsg");
        String response = restTemplate.getForObject( url, String.class);
        logger.info("response={%S}", response);
        return response;
    }*/

}
