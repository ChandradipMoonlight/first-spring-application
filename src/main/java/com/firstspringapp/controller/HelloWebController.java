package com.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *Indicates that an annotated class is a "Controller" (e.g. a web controller).
 * This annotation serves as a specialization of @Component, allowing for
 * implementation classes to be autodetected through classpath scanning.
 * It is typically used in combination with annotated handler methods based
 * on the @RequestMapping
 */
@Controller
public class HelloWebController {

    /**
     * Annotation for mapping HTTP GET requests onto specific handler methods.
     * Specifically, @GetMapping is a composed annotation that acts as a
     * shortcut for @RequestMapping(method = RequestMethod.GET).
     * @return String;
     */
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message",
                "This is a custom message, Hello from BridgeLabz");
        return "message";
    }
}
