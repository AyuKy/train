package com.Ayuky.train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/test")
    public static String Hello(){
        return "Hello world";
    }
}
