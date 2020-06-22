package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@Controller
public class Login {
    @RequestMapping("/login")
    public String login(){
        File f = new File(".");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);
        return absolutePath;
    }
}
