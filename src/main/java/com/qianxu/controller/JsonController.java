package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.JsonUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class JsonController {

    @RequestMapping(value = "/api/json/test", method = RequestMethod.GET)
    public String test(ModelMap mm) {
        List<JsonUser> list = Lists.newArrayList();
        list.add(new JsonUser("qianxu", Lists.newArrayList("上海", "姜堰")));
        list.add(new JsonUser("hangyiyun", Lists.newArrayList("北京", "姜堰")));
        mm.addAttribute("userList", list);
        List<JsonUser> list2 = Lists.newArrayList();
        list2.add(new JsonUser("111", Lists.newArrayList("天津", "河北")));
        list2.add(new JsonUser("222", Lists.newArrayList("武汉", "重庆")));
        mm.addAttribute("list2", list2);
        return "userJsonView";
    }
}
