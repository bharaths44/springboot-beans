package com.bharath.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    @Autowired
    private  HelloClass helloClass;



    public String tellAStory() {
        return "the dependency is saying: " + helloClass.sayHello();
    }
}
