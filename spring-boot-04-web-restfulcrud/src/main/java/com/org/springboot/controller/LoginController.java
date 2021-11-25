package com.org.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username ,
                        @RequestParam("password") String password ,
                        Map<String , Object> map){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            // 重定向main.html 在配置里会被重新映射到 dashboard
            return "redirect:/main.html";
        }else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
