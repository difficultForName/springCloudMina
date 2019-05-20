package com.yp.mina.rabbon_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RabbonUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbonUserApplication.class, args);
    }

}
