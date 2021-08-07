package com.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication this annotation enables Spring Boot's Auto
 * configuration mechanism.
 * same as @Configuration @EnableAutoConfiguration @ComponentScan
 */
@SpringBootApplication
public class FirstSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringAppApplication.class, args);
        System.out.println("Hello World from BridgeLabz");
    }

}
