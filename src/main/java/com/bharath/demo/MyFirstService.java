package com.bharath.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private HelloClass helloClass;
    private Environment environment;

    @Autowired
    public void setMyFirstClass(@Qualifier("bean1") HelloClass helloClass) {
        this.helloClass = helloClass;
    }

    public String tellAStory() {
        return "the dependency is saying: " + helloClass.sayHello();
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;

    }

    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }

    public String getOSName() {
        return environment.getProperty("os.name");
    }

    public String readProp() {
        return environment.getProperty("spring.application.name");
    }
}
