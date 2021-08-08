package com.firstspringapp;

import com.firstspringapp.component.DemoBean;
import com.firstspringapp.controller.HelloRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @SpringBootApplication this annotation enables Spring Boot's Auto
 * configuration mechanism.
 * same as @Configuration @EnableAutoConfiguration @ComponentScan
 */
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello World from BridgeLabz");
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println("Demo Bean = "+ demoBean);
        System.out.println(context.getBean(HelloRestController.class));
    }

}
