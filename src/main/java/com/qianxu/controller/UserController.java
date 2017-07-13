package com.qianxu.controller;

import com.qianxu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "user/register";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createUser")
    public ModelAndView createUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/success");
        modelAndView.addObject(user);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test", params = {"userId"})
    @ResponseBody
    public String test1(@RequestParam("userId") String userId) {
        return "this is userId=" + userId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test", params = {"customerId"})
    @ResponseBody
    public String test2(@RequestParam("customerId") String customerId) {
        return "this is customerId=" + customerId;
    }
}
