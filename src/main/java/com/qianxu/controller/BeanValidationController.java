package com.qianxu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianxu.controller.req.ProductReq;
import com.qianxu.entity.Result;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

@Controller
public class BeanValidationController {
    @Autowired
    private Validator validator;

    @RequestMapping(value = "/api/validation/v1", method = RequestMethod.POST)
    @ResponseBody
    public Result test1(@RequestBody ProductReq req) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator1 = factory.getValidator();
        Set<ConstraintViolation<ProductReq>> set = validator1.validate(req);
        Iterator<ConstraintViolation<ProductReq>> iterator = set.iterator();
        if (iterator.hasNext()) {
            ConstraintViolation<ProductReq> violation = iterator.next();
            return new Result<>(500, violation.getMessage());
        }
        return new Result<>(200, 1);
    }

    @RequestMapping(value = "/api/validation/v2", method = RequestMethod.POST)
    @ResponseBody
    public Result test2(@RequestBody ProductReq req) {
        Set<ConstraintViolation<ProductReq>> set = validator.validate(req);
        if(!set.isEmpty())
            throw new ConstraintViolationException(set);
        return new Result<>(200, 1);
    }
}
