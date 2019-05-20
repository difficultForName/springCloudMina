package com.yp.mina.rabbon_user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return "I am user list.";
    }
}
