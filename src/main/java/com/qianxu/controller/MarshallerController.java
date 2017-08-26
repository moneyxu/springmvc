package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.MarShallerUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class MarshallerController {

    @RequestMapping(value = "/api/marshaller/test1", method = RequestMethod.GET)
    public String test1(ModelMap map) {
        List<MarShallerUser> userList = Lists.newArrayList();
        userList.add(new MarShallerUser("qianxu", 29, new Date()));
        userList.add(new MarShallerUser("张三", 22, new Date()));
        userList.add(new MarShallerUser("李四", 33, new Date()));
        map.addAttribute("userList", userList);
        return "userListXml";
    }
}
