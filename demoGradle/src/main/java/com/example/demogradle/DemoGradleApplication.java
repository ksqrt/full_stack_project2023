package com.example.demogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"board.controller"})
public class DemoGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGradleApplication.class, args);
    }

}
