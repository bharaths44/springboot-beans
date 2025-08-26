package com.bharath.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private final HelloClass helloClass;

    @Autowired
    public MyFirstService(HelloClass helloClass) {
        this.helloClass = helloClass;
    }

    public String tellAStory() {
        return "the dependency is saying: " + helloClass.sayHello();
    }
}
