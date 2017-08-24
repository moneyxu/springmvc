package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.FreeMarkerUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FreeMarkerController {

    @RequestMapping(value = "/api/freemarker/test1", method = RequestMethod.GET)
    public String test1(ModelMap map) {
        List<FreeMarkerUser> users = Lists.newArrayList();
        users.add(new FreeMarkerUser("qianxu"));
        users.add(new FreeMarkerUser("李四"));
        users.add(new FreeMarkerUser("王五"));
        map.addAttribute("userList", users);
        return "userList";
    }
}
