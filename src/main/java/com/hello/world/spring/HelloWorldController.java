package com.hello.world.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String holaMundo() {
        return "¡Hello World from Spring Boot!";
    }
}