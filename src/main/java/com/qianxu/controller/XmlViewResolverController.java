package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.JsonUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class XmlViewResolverController {

    @RequestMapping(value = "/api/xmlViewResolver/test")
    public String test(ModelMap mm){
        List<JsonUser> list = Lists.newArrayList();
        list.add(new JsonUser("qianxu", Lists.newArrayList("上海", "姜堰")));
        list.add(new JsonUser("hangyiyun", Lists.newArrayList("北京", "姜堰")));
        mm.addAttribute("userList", list);
        return "userJsonView";
    }
}
