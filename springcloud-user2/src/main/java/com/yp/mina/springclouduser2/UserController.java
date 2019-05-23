package com.yp.mina.springclouduser2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        System.out.println("这边输出getUser");
        return "I am user list333.";
    }
}
