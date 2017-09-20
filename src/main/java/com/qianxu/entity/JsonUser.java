package com.qianxu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JsonUser {

    private String name;

    private List<String> address;
}
