package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // First hit Point
    @RequestMapping("/hello")
    public String hello(){
        return "Welcome To Spring Boot";
    }
    //Second hit Point
    @RequestMapping("/stop")
    public String stop(){
        return "Bye Spring Boot";
    }
}
