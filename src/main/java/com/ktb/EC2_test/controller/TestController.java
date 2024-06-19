package com.ktb.EC2_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello-world")
    public String hello() {
        return "hello world";
    }
}
