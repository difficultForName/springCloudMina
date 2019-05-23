package com.yp.mina.springcloudorderfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudOrderfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrderfeignApplication.class, args);
    }

}
