package com.qianxu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qianxu.entity.User;

import javax.xml.bind.JAXBContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserControllerTest {

    @Test
    public void testJAXB2() throws Exception {
        User user = new User();
        user.setUserName("qianxu");
        user.setPassword("test1234");
        JAXBContext context = JAXBContext.newInstance(User.class);

    }
}