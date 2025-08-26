package com.bharath.demo;

import org.springframework.context.annotation.Bean;

public class ApplicationConfig {
     @Bean
     public HelloClass helloClass() {
     return new HelloClass();
     }
}
