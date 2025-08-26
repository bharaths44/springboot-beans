package com.bharath.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    @Qualifier("bean1")
    public HelloClass myFirstBean() {
        return new HelloClass("First Bean");
    }

    @Bean

    public HelloClass mySecondBean() {
        return new HelloClass("Second Bean");
    }

    @Bean
    @Primary
    public HelloClass myThirdBean() {
        return new HelloClass("Third Bean");
    }
}
