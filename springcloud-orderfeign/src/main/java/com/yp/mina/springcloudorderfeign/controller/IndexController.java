package com.yp.mina.springcloudorderfeign.controller;

import com.yp.mina.springcloudorderfeign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private HelloFeignService feignService;

    @RequestMapping(value = "/getUser" , method = RequestMethod.GET)
    public String getUser(String name){
        return feignService.getUser();
    }
}
