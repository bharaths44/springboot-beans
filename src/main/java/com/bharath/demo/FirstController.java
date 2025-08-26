package com.bharath.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    // @GetMapping("/hello")
    // public String sayHello() {
    // return "Hello, World!";
    // }

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

    // http://localhost:8080/hello/alibou
    // @GetMapping("/hello/{user-name}")
    // public String pathVar(@PathVariable("user-name") String userName) {
    // return "Hello " + userName;
    // }

    // http://localhost:8080/hello?param_name=paramvalue&param_name_2=value_2
    @GetMapping("/hello")
    public String paramVar(@RequestParam("user-name") String userName,
            @RequestParam("user-lastname") String lastName) {
        return "Hello " + userName + " " + lastName;
    }

}
