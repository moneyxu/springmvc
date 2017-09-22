package com.qianxu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class LocaleResolverController {

    @RequestMapping(value = "/api/localeResolver/test1", method = RequestMethod.GET)
    @ResponseBody
    public String test1(HttpServletRequest request) {
        RequestContext requestContext = new RequestContext(request);
        Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
        return requestContext.getMessage("locale");
    }
}
