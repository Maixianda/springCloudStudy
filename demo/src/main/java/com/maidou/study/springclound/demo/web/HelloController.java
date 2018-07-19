package com.maidou.study.springclound.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "狼烟风沙口~~~";
    }
}
