package com.bharath.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);
		HelloClass helloClass = ctx.getBean("myFirstBean", HelloClass.class);
		System.out.println(helloClass.sayHello());
	}
}