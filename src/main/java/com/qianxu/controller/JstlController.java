package com.qianxu.controller;

import com.qianxu.entity.City;
import com.qianxu.entity.Gender;
import com.qianxu.entity.JstlUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("user")
public class JstlController {

    @RequestMapping(value = "/api/jstl/test1", method = RequestMethod.GET)
    public String getTest1(ModelMap modelMap) {
        JstlUser jstlUser = new JstlUser();
        List<String> favor = new ArrayList<>();
        favor.add("basketball");
        jstlUser.setFav(favor);
        jstlUser.setName("qianxu");
        modelMap.addAttribute("user", jstlUser);
        // Map<String, String> gender = new HashMap<>();
        // gender.put("male", "男");
        // gender.put("female", "女");
        List<Gender> gender = new ArrayList<>();
        gender.add(new Gender("male", "男"));
        gender.add(new Gender("female", "女"));
        modelMap.addAttribute("gender", gender);
        Map<String, String> fav = new HashMap<>();
        fav.put("football", "足球");
        fav.put("basketball", "篮球");
        fav.put("read", "读书");
        modelMap.addAttribute("fav", fav);
        List<City> city = new ArrayList<>();
        city.add(new City("shanghai", "上海"));
        city.add(new City("beijing", "北京"));
        city.add(new City("guangzhou", "广州"));
        modelMap.addAttribute("city", city);
        List<City> hometown = new ArrayList<>();
        hometown.add(new City("jiangsu", "江苏"));
        hometown.add(new City("zhejiang", "浙江"));
        hometown.add(new City("shandong", "山东"));
        modelMap.addAttribute("hometown", hometown);
        return "user/jstl";
    }

    @RequestMapping(value = "/api/jstl/test1", method = RequestMethod.POST)
    public String postTest1(@ModelAttribute("user") JstlUser user) {
        System.out.println(user);
        return "user/jstlSuccess";
    }
}
