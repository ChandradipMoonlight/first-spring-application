package com.firstspringapp;

import com.firstspringapp.component.DemoBean;
import com.firstspringapp.component.EmployeeBean;
import com.firstspringapp.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello World from BridgeLabz");
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.debug("Demo Bean = "+ demoBean);
        logger.debug(String.valueOf(context.getBean(HelloRestController.class)));
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework guru");
        employeeBean.showEmployeeDetails();
    }

}
