package com.qianxu.controller.req;

import lombok.Data;

@Data
@ProductValidate
public class ProductReq {

    private String name;

    private Double weight;
}
