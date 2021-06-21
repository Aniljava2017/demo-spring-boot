package com.example.demospringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Welcome Mapping hit Point
    @RequestMapping("/welcome")
    public String wel(){
        return "Welcome To Spring Boot Project";
    }
    // Addition Mapping First hit point
    @RequestMapping("/add")
    public String add(){
        int a=5;
        int b=5;
        return "Addition Value : "+(a+b);
    }
    // Subtract Mapping Second hit Point
    @RequestMapping("/sub")
    public String sub(){
        int a=5;
        int b=4;
        return "Subtract Value : "+(a-b);
    }

    // Divided Mapping Third hit Point
    @RequestMapping("/div")
    public String dev(){
        int a=5;
        int b=5;
        return "Divided Value : "+(a/b);
    }
    // Multiplication Mapping Four hit Point
    @RequestMapping("/mul")
    public String mul(){
        int a=5;
        int b=5;
        return "Multiplication Value : "+(a*b);
    }
    // Bye Mapping hit Point
    @RequestMapping("/bye")
    public String bye(){
        return "Bye";
    }
}
