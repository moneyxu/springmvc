package com.qianxu.controller;

import com.qianxu.entity.Rabbit;
import com.qianxu.entity.editor.RabbitEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RabbitController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Rabbit.class, new RabbitEditor());
    }

    @RequestMapping(value = "rabbit1", method = RequestMethod.GET)
    @ResponseBody
    public Rabbit rabbit1(@RequestParam("rabbit") Rabbit rabbit) {
        return rabbit;
    }

}
