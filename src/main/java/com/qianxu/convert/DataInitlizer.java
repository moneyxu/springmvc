package com.qianxu.convert;

import com.qianxu.entity.Rabbit;
import com.qianxu.entity.editor.RabbitEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class DataInitlizer implements WebBindingInitializer {

    public void initBinder(WebDataBinder binder, WebRequest request) {
        binder.registerCustomEditor(Rabbit.class, new RabbitEditor());
    }
}
