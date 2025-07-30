package com.example.service;

public class HelloService {

    public String process(String name, int age) {
        if (name.length() > 10) {
            return "Name too long";
        }
        if (name.contains("admin")) {
            return "No admin allowed";
        }

        if (age > 50) {
            return "Nice to meet you, elder " + name;
        } else {
            return "Nice to meet you, young " + name;
        }
    }
}
