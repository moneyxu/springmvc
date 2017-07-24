package com.qianxu.controller;

import com.qianxu.entity.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("dog")
public class DogController {

    @RequestMapping(value = "/dog/get",method = RequestMethod.GET)
    @ResponseBody
    public Dog getDog(){
        Dog dog = new Dog();
        dog.setName("大黄");
        dog.setVariety("金毛");
        return dog;
    }

    @RequestMapping(value = "/dog/mydog1",method = RequestMethod.GET)
    public ModelAndView myDog1(@ModelAttribute("dog") Dog dog){
        dog.setName("大黄");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/dog");
        modelAndView.addObject(dog);
        return modelAndView;
    }

    @RequestMapping(value = "/dog/mydog2",method = RequestMethod.GET)
    public String myDog2(@ModelAttribute("dog") Dog dog){
        dog.setName("大黄");
        return "user/dog";
    }

    @RequestMapping(value = "/dog/mydog3",method = RequestMethod.GET)
    public String myDog3(@ModelAttribute("dog") Dog dog){
        return "user/dog";
    }

    @RequestMapping(value = "/dog/mydog4",method = RequestMethod.GET)
    public String myDog4(ModelMap map){
        map.addAttribute("owner","qianxu");
        Dog dog = (Dog) map.get("dog");
        dog.setName("大黑");
        return "user/dog";
    }

    @RequestMapping(value = "/dog/mydog5",method = RequestMethod.GET)
    public ModelAndView myDog5(HttpSession session){
        Dog dog = (Dog) session.getAttribute("dog");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(dog);
        modelAndView.setViewName("user/dog");
        return modelAndView;
    }

    @ModelAttribute("dog")
    public Dog getMyDog(){
        Dog dog = new Dog();
        dog.setName("大黄");
        dog.setVariety("金毛");
        return dog;
    }
}
