package com.qianxu.controller;

import com.qianxu.entity.JSR303;
import com.qianxu.entity.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class ValidatorController {

    @RequestMapping(value = "/api/validate")
    @ResponseBody
    public String validate(@Valid JSR303 req, BindingResult bindingResult){
        System.out.println(req);
        return "success";
    }

    @RequestMapping(value = "/api/validate/register")
    public String register(){
        return "user/registerError";
    }

    @RequestMapping(value = "/api/validate/userRegister")
    public String userRegister( @ModelAttribute("register") UserRegister userRegister, BindingResult bindingResult){
        ValidationUtils.rejectIfEmptyOrWhitespace(bindingResult,"userName","required");
        if("a".equals(userRegister.getUserName()))
            bindingResult.reject("userName","用户已注册");
        if(bindingResult.hasErrors()){
            return "user/registerError";
        }else{
            return "user/registerSuccess";
        }
    }

    @ModelAttribute("register")
    public UserRegister getUserRegister(){
        return new UserRegister();
    }

}
