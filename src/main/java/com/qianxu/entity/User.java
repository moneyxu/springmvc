package com.qianxu.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="user",propOrder = {"userName","password"})
public class User {
    @XmlElement
    private String userName;

    @XmlElement
    private String password;
}
