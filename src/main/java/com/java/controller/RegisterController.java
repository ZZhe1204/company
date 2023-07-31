package com.java.controller;

import com.java.pojo.MyUser;
import com.java.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class RegisterController {
    @Autowired
    private MyUserService myUserService;

    @RequestMapping("/register")
    public String register(){
        return "users/register";
    }
    @RequestMapping("/registerAdd")
    public String registerAdd(MyUser myUser){
        myUserService.add(myUser);
        return "index";
    }
}
