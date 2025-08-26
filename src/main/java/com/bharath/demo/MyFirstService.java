package com.bharath.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    @Autowired
    @Qualifier("bean1")
    private HelloClass helloClass;

    @Autowired
    public void injectDependency(@Qualifier("mySecondBean") HelloClass helloClass) {
        this.helloClass = helloClass;
    }

    public String tellAStory() {
        return "the dependency is saying: " + helloClass.sayHello();
    }
}
