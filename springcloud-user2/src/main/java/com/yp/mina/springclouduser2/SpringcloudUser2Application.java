package com.yp.mina.springclouduser2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudUser2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUser2Application.class, args);
    }

}
