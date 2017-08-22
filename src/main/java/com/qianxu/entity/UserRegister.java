package com.qianxu.entity;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserRegister {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;
}
