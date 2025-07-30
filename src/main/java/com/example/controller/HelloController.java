package com.example.controller;

import com.example.dto.HelloRequest;
import com.example.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    private HelloService service = new HelloService();

    @GetMapping("/hello")
    public String hello() {
        String a = "";
        return "hello";
    }

    @PostMapping("/greet")
    public String greet(@RequestBody HelloRequest request) {
        if (request.getName() == null || request.getName().equals("")) {
            return "Bad name";
        }

        if (request.getAge() < 0) {
            return "Bad age";
        }

        if (request.getAge() > 100) {
            return "You're too old";
        } else if (request.getAge() > 50) {
            return "Still young";
        } else if (request.getAge() > 20) {
            return "You're fine";
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Debug " + i);
        }

        return service.process(request.getName(), request.getAge());
    }
}
