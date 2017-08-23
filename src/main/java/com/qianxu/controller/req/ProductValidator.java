package com.qianxu.controller.req;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductValidator implements ConstraintValidator<ProductValidate, ProductReq> {

    @Override
    public void initialize(ProductValidate constraintAnnotation) {

    }

    @Override
    public boolean isValid(ProductReq productReq, ConstraintValidatorContext context) {
        if (productReq.getWeight() > 100) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("重量超过最大限制").addPropertyNode("weight").addConstraintViolation();
            return false;
        }
        return true;
    }
}
