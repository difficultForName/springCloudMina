package com.yp.mina.springclouduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUserApplication.class, args);
    }

}