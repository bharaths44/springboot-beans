package com.bharath.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private final HelloClass helloClass;

    @Autowired
    public MyFirstService(
            @Qualifier("bean2") HelloClass helloClass) {
        this.helloClass = helloClass;
    }

    public String tellAStory() {
        return "the dependency is saying: " + helloClass.sayHello();
    }
}
