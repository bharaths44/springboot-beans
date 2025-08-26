package com.bharath.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "Posted message: " + message;
    }

    @PostMapping("/post-order")
    public String post(@RequestBody Order order) {
        return "Posted message: " + order.toString();
    }
}
