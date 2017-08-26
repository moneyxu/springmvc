package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.ExcelUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class ExcelController {

    @RequestMapping(value = "/api/excel/test1",method = RequestMethod.GET)
    public String test1(ModelMap map){
        List<ExcelUser> list = Lists.newArrayList();
        list.add(new ExcelUser("qianxu",29,new Date()));
        list.add(new ExcelUser("张三",25,new Date()));
        list.add(new ExcelUser("李四",39,new Date()));
        map.addAttribute("userList",list);
        return "userListExcelView";
    }
}
