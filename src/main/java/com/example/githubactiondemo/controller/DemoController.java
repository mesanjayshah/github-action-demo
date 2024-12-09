package com.example.githubactiondemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

    @GetMapping("say")
    public String sayHello() {
        return "Hello World";
    }

}
