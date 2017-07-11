package com.qianxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qianxu on 2017/7/11.
 */
@Controller
public class HealthController {

    @RequestMapping(value = "/api/health", method = RequestMethod.GET)
    @ResponseBody
    public String health() {
        return "success";
    }
}
