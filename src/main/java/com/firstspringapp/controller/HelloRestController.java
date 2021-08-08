package com.firstspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    /**
     * Usage: @RequestMapping is the annotation for mapping web requests onto methods in request-handling classes
     * with flexible method signatures.
     * When we provide the url as localhost:8080/hello, we basically invoke the return message and output it.
     * or curl localhost:8080/ -w "/n" in terminal by using this url we cnn get message as output.
     * @return message in web page.
     */

    @RequestMapping(value = {"","/", "/home"})
    public String sayHello() {
        return "Hello form BridgeLabz";
    }
}
