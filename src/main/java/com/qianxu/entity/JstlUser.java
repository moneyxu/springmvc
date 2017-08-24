package com.qianxu.entity;

import lombok.Data;

import java.util.List;

@Data
public class JstlUser {

    private String name;

    private String password;

    private String gender;

    private List<String> fav;

    private String city;

    private String hometown;

    private String description;
}
