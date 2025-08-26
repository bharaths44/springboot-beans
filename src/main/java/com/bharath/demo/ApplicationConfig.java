package com.bharath.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
     @Bean
     public HelloClass myFirstBean() {
         return new HelloClass("First Bean");
     }
}
