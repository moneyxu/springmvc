package com.qianxu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountControllerTest {


    @Test
    public void getAccount() throws Exception {
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String,String> map = new HashMap<>();
        map.put("createTime","2017-03-21");
        map.put("amount","100.36");
        HttpEntity entity = new HttpEntity<>(map,headers);
        ResponseEntity<Map<String, String>> resp = template.exchange("http://localhost:8080/api/account", HttpMethod.POST, entity, new ParameterizedTypeReference<Map<String, String>>() {
        }, new HashMap<>());
        Map<String, String> m = resp.getBody();
        System.out.println();
    }

}