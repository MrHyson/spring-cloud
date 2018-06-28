package com.taiyi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:hyson
 * Date:2018-06-12 23:04
 **/
@RestController
public class UserController {


    @GetMapping("/user")
    public String getById(){
        User user=new User();
        user.setAge(23);
        user.setName("hyson");
        return user.getName();
    }
}
