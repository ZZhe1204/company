package com.java.controller;

import com.java.pojo.MyUser;
import com.java.service.MyUserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class UserController {
    @Autowired
    private MyUserService myUserService;
    @GetMapping("/userEmp")
    public String getAllUser(Model model){
        Collection<MyUser> allUser = myUserService.getAllUser();
        model.addAttribute("allUser",allUser);
        return "users/userList";
    }
    @GetMapping("/updateUser/{id}")
    public String toUser(Model model, @PathVariable Integer id){
        MyUser myUser = myUserService.getOne(id);
        model.addAttribute("user",myUser);
        return "users/upUser";
    }
    @PostMapping("/updateUser")
    public String update(MyUser myUser,Model model){
        myUserService.upUser(myUser);
        model.addAttribute("msg","请重新登录");
        return "index";
    }
    @GetMapping("/deleteUser/{id}")
    public String delete(@PathVariable Integer id,Model model){
        myUserService.delUser(id);
        model.addAttribute("msg","请重新登录");
        return "index";
    }
}
