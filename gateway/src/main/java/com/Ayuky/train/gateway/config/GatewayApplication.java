package com.Ayuky.train.gateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.Ayuky")
public class GatewayApplication {
    public static void main(String[] args){
        Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Successfully launch");
        LOG.info("网关地址 :\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }}
