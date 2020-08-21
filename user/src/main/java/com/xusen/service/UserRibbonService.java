package com.xusen.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInfoFailure")
    public String getInfo(){
        System.out.println("调用 服务 EUREKA-CLIENT/info");
        String message = restTemplate.getForObject("http://EUREKA-CLIENT/info",String.class);
        System.out.println("服务 EUREKA-CLIENT/info 返回信息 : " + message);
        return message;
    }

    public String getInfoFailure() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }
}
