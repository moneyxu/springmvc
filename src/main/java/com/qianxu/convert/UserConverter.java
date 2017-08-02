package com.qianxu.convert;

import com.qianxu.entity.User;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter<String, User> {

    public User convert(String s) {
        String[] split = s.split(",");
        User user = new User();
        user.setUserName(split[0]);
        user.setPassword(split[1]);
        return user;
    }
}
