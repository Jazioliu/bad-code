package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        String unusedVariable = "Hello!";
        SpringApplication.run(Application.class, args);
    }
}
