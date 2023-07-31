package com.java.controller;

import com.java.pojo.MyUser;
import com.java.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    /**
     * 登录
     *
     * @param username
     * @param password
     * @param model
     * @return
     */
    @Autowired
    private MyUserService myUserService;
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,Model model, HttpSession session) {
        MyUser myUser = myUserService.getMyUser(username,password);
        if (myUser != null) {
            session.setAttribute("loginUser",myUser.getUname());
            session.setAttribute("userId",myUser.getId());
            return "redirect:/main.html";
        } else {
            //用户名或密码错误
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }
    @GetMapping("/user/logout")
    public String out(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
