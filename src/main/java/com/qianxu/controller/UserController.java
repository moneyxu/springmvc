package com.qianxu.controller;

import com.qianxu.entity.Book;
import com.qianxu.entity.BookMark;
import com.qianxu.entity.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    @ResponseBody
    public Book getBook() {
        Book book = new Book();
        book.setIsbn("ISBN0001");
        book.setName("qianxu");
        BookMark bookMark1 = new BookMark();
        bookMark1.setComment("第一个标签");
        bookMark1.setNumber(15);
        BookMark bookMark2 = new BookMark();
        bookMark2.setComment("第二个标签");
        bookMark2.setNumber(25);
        List<BookMark> bookMarks = new ArrayList<BookMark>();
        bookMarks.add(bookMark1);
        bookMarks.add(bookMark2);
        book.setBookMarks(bookMarks);
        return book;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "user/register";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createUser")
    public ModelAndView createUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/success");
        modelAndView.addObject(user);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test", params = {"userId"})
    @ResponseBody
    public String test1(@RequestParam("userId") String userId) {
        return "this is userId=" + userId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test", params = {"customerId"})
    @ResponseBody
    public String test2(@RequestParam("customerId") String customerId) {
        return "this is customerId=" + customerId;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/cookie")
    @ResponseBody
    public String cookieValue(@CookieValue(value = "tk") String tk, @RequestHeader("sess") String sess) {
        return tk + " " + sess;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/withoutparam",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String withoutparam(@RequestParam("userName") String userName,@RequestParam("password") String password) {
        return userName+ " " + password;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/handler21")
    @ResponseBody
    public void handler21(HttpServletRequest req, HttpServletResponse resp){
        String userName = WebUtils.findParameterValue(req, "userName");
        try {
            resp.getWriter().print(userName);
            resp.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(method = RequestMethod.POST,value = "/handler22")
    @ResponseBody
    public String handler22(HttpSession session){
        String userName = (String) session.getAttribute("userName");
        return userName;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/handler23")
    @ResponseBody
    public String handler23(){
        return "钱旭";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/handler24")
    @ResponseBody
    public byte[] handler24() throws Exception{
        Resource resource = new ClassPathResource("star.jpg");
        return FileCopyUtils.copyToByteArray(resource.getInputStream());
    }
}
