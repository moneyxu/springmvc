package com.qianxu.controller;

import com.google.common.collect.Lists;
import com.qianxu.entity.PdfUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class PdfController {

    @RequestMapping(value = "/api/pdf/test1",method = RequestMethod.GET)
    public String test1(ModelMap map){
        List<PdfUser> list = Lists.newArrayList();
        list.add(new PdfUser("qianxu",29,new Date()));
        list.add(new PdfUser("zhangsan",23,new Date()));
        list.add(new PdfUser("lisi",29,new Date()));
        map.addAttribute("userList",list);
        return "userListPdfView";
    }

}
