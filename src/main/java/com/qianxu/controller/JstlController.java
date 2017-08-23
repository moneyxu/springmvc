package com.qianxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qianxu.entity.User;

@Controller
public class JstlController {

    @RequestMapping(value = "/api/jstl/test1",method = RequestMethod.GET)
    public String test1(ModelMap modelMap){
        User user = new User();
        user.setUserName("qianxu");
        user.setPassword("123456");
        modelMap.addAttribute("user",user);
        return "user/jstl";
    }
}
