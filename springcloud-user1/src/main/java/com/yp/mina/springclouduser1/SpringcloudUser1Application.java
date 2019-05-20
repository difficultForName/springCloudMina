package com.yp.mina.springclouduser1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudUser1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUser1Application.class, args);
    }

}
