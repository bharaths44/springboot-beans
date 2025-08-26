package com.bharath.demo;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post-order-record")
    public String postRecord(@RequestBody OrderRecord order) {
        return "Posted message: " + order.toString();
    }

    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName) {
        return "Hello " + userName;
    }

}
