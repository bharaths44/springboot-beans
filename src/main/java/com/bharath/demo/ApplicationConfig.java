package com.bharath.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
     @Bean
     @Qualifier("bean1")
     public HelloClass myFirstBean() {
         return new HelloClass("First Bean");
     }
    @Bean
    @Qualifier("bean2")
    public HelloClass mySecondBean() {
        return new HelloClass("Second Bean");
    }
}
