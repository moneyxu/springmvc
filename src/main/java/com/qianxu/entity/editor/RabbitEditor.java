package com.qianxu.entity.editor;

import com.qianxu.entity.Rabbit;

import java.beans.PropertyEditorSupport;

public class RabbitEditor extends PropertyEditorSupport{
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] split = text.split(",");
        Rabbit rabbit= new Rabbit();
        rabbit.setName(split[0]);
        rabbit.setAge(split[1]);
        setValue(rabbit);
    }
}
