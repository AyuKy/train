package com.Ayuky.train.member.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.Ayuky.train.member.controller")
public class MemberApplication {
    public static void main(String[] args){
        SpringApplication.run(MemberApplication.class);
    }
}
