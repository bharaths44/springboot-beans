package com.bharath.demo;

public class HelloClass {
    private  String myVar;
    public HelloClass(String myVar){
        this.myVar = myVar;
    }
    public String sayHello() {
        return "Hello from HelloClass: " + myVar;
    }
}
