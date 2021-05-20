package com.jyalla.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MailUtil mailUtil;

    @GetMapping
    public String hello() {
        mailUtil.sendEmail("johnpranoy7@gmail.com");
        return "hello";
    }
}
