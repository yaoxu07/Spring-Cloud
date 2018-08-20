//package com.yx.controller;
//
///**
// * @program: DataSendJsonDemo
// * @description: data send ！
// * @author: yaoxu
// * @create: 2018-08-16 22:05
// **/
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.util.EntityUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.ws.rs.core.MediaType;
//import java.io.IOException;
//import java.nio.charset.Charset;
//
//@RestController
//public class DataSend {
//    Logger logger = LoggerFactory.getLogger(DataSend.class) ;
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    public String hello() throws IOException {
//
//        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
//        HttpClient httpClient = httpClientBuilder.build();
//        String ip = "127.0.0.1" ;
//        String srvName = "" ;
//        String url = "http://"+ip+":8001"+"direct"+"/"+srvName ;
//        String bodyJson = "{\"respcode\":\"000000\",\"respinfo\":成功\"}";
//        HttpPost httpPost = new HttpPost(url) ;
//        httpPost.addHeader("Content-type", MediaType.APPLICATION_JSON+";charest=UTF-8");
//        httpPost.setEntity(new StringEntity(bodyJson,Charset.forName("UTF-8")));
//        HttpResponse httpResponse = httpClient.execute(httpPost) ;
//        logger.info("");
//        return EntityUtils.toString(httpResponse.getEntity()) ;
//    }
//
//}
