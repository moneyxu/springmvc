package com.qianxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianxu.entity.Rabbit;

@Controller
public class NewRabbitController {

    @RequestMapping(value = "newrabbit1",method = RequestMethod.GET)
    @ResponseBody
    public Rabbit rabbit1(@RequestParam("rabbit") Rabbit rabbit) {
        return rabbit;
    }
}
