package com.yyz.hrms.controller;

import com.yyz.hrms.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("dologin")
    public String dologin(User user) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
            System.out.println(user.getUsername() + ":" + user.getPassword());
            return "index";
        } else {
            return "error";
        }
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
