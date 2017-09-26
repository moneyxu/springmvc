package com.qianxu.controller;

import org.bouncycastle.ocsp.Req;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class MultipartResolverController {

    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String upload(){
        return "user/upload";
    }

    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public String uploadFile(@RequestParam(value = "file") MultipartFile file){
        try {
            file.transferTo(new File("D:/uploadFile.js"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "user/uploadSuccess";
    }
}
