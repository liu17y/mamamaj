package com.gzy.gituse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
