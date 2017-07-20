package com.qianxu.controller;

import com.qianxu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserControllerTest {

    @Test
    public void testMarshaller() throws Exception {
        User user = new User();
        user.setUserName("qianxu");
        user.setPassword("test1234");
        JAXBContext context = JAXBContext.newInstance(User.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
        File file = new File("D:\\user.xml");
        marshaller.marshal(user, file);
    }

    @Test
    public void testUnMarshaller() throws Exception {
        JAXBContext context = JAXBContext.newInstance(User.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File("D:\\user.xml");
        User user = (User) unmarshaller.unmarshal(file);
        System.out.println(user);
    }
}
