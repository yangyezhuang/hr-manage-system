package com.yyz.hrms.controller;

import com.yyz.hrms.entity.User;
import com.yyz.hrms.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private HostHolder hostHolder;

    @GetMapping("/" )
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/welcome1")
    public String welcome1() {
        return "home";
    }



    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String dologin(String username, String password) {
        if (username.equals("tom" ) && password.equals("123" )) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            hostHolder.setUser(user);

            return "index";
        } else {
            return "error";
        }
    }
}
