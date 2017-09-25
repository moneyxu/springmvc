package com.qianxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class LocaleResolverController {

    @RequestMapping(value = "/api/localeResolver/test1", method = RequestMethod.GET)
    @ResponseBody
    public String test1(HttpServletRequest request) {
        //Accept-Language:en-US,en;q=0.5
        RequestContext requestContext = new RequestContext(request);
        Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
        return requestContext.getMessage("locale");
    }

    @RequestMapping(value = "/api/localeResolver/test2",method = RequestMethod.GET)
    @ResponseBody
    public String test2(HttpServletRequest request){
        //clientLanguage:zh_CN
        RequestContext context = new RequestContext(request);
        return context.getMessage("locale");
    }

    @RequestMapping(value = "/api/localeResolver/test3",method = RequestMethod.GET)
    @ResponseBody
    public String test3(HttpServletRequest request,HttpSession session){
        RequestContext context = new RequestContext(request);
        Locale locale = (Locale) session.getAttribute(
                SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        return context.getMessage("locale");
    }

    @ModelAttribute(value = "org.springframework.web.servlet.i18n.SessionLocaleResolver.LOCALE")
    public Locale getSessionLocale(){
        return Locale.CHINA;
    }
}
