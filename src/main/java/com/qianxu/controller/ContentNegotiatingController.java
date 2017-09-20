package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.ContentNegotiatingUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ContentNegotiatingController {

    @RequestMapping(value = "/api/nego/test", method = RequestMethod.GET)
    public String test(ModelMap mm) {
        List<ContentNegotiatingUser> users = Lists.newArrayList();
        users.add(new ContentNegotiatingUser("qianxu", 29));
        users.add(new ContentNegotiatingUser("yiyun", 26));
        mm.addAttribute("userList",users);
        return "ContentNegotiatingView";
    }
}
