package com.qianxu.controller;

import com.qianxu.entity.JSR303;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class ValidatorController {

    @RequestMapping(value = "/api/validate")
    @ResponseBody
    public String validate(@Valid JSR303 req){
        System.out.println(req);
        return "success";
    }
}
