package com.qianxu.controller;

import com.qianxu.entity.Cat;
import com.qianxu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(value={"cat"},types = {User.class})
public class CatController {

    @RequestMapping(value = "cat1",method = RequestMethod.GET)
    public String cat1(@ModelAttribute("cat") Cat cat,@ModelAttribute("user") User user){
        return "user/cat";
    }

    @RequestMapping(value = "cat2",method = RequestMethod.GET)
    public ModelAndView cat2(HttpSession session){
        Cat cat = (Cat) session.getAttribute("cat");
        User user = (User) session.getAttribute("user");
        ModelAndView m = new ModelAndView("user/cat");
        m.addObject(cat);
        return m;
    }

    @ModelAttribute
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge("2");
        return cat;
    }

    @ModelAttribute
    public User user(){
        User user = new User();
        user.setUserName("qianxu");
        user.setPassword("test");
        return user;
    }
}
