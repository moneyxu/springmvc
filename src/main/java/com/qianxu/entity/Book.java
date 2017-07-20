package com.qianxu.entity;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private String name;
    private String isbn;
    private List<BookMark> bookMarks;
}
