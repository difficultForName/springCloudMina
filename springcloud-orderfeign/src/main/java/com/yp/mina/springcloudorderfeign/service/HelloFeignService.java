package com.yp.mina.springcloudorderfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user" )
public interface HelloFeignService {
    //地址为服务提供者对外暴露的地址
    @RequestMapping(value = "/getUser" , method = RequestMethod.GET)
    String getUser();
}
