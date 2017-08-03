package com.qianxu.controller;

import com.qianxu.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

    @RequestMapping(value = "/api/account", method = RequestMethod.POST)
    @ResponseBody
    public Account getAccount(@RequestBody Account account) {
        return account;
    }
}
