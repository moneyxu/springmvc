package com.qianxu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PdfUser {

    private String name;

    private int age;

    private Date registerTime;
}
