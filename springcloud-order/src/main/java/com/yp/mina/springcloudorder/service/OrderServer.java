package com.yp.mina.springcloudorder.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServer {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService() {
        return restTemplate.getForEntity("http://user/getUser",String.class).getBody();
    }

    public String helloError(){
        return "request Error";
    }

}