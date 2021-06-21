package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    // Addition End Point Pathvariable
    @RequestMapping("/addition/{a}/{b}")
        public int addition(@PathVariable int a , @PathVariable int b){
        int sum=a+b;
        return sum;
    }
    // Addition End Point RequestParam
    @RequestMapping("/addition")
    public int additionreq(@RequestParam int a , @RequestParam int b){
        int sum=a+b;
        return sum;
    }
    // Subtraction End Point Pathvariable
    @RequestMapping("/subtraction/{a}/{b}")
    public int subtraction(@PathVariable int a, @PathVariable int b){
        int sub=a-b;
        return sub;
    }
    // Subtraction End Point RequestParam
    @RequestMapping("/subtraction")
    public int subtractionreq(@RequestParam int a , @RequestParam int b){
        int sub=a-b;
        return sub;
    }
    // Multiplication End Point Pathvariable
    @RequestMapping("/multiplication/{a}/{b}")
    public int multiplication(@PathVariable int a, @PathVariable int b){
        int mul=a*b;
        return mul;
    }
    // Multiplication End Point RequestParam
    @RequestMapping("/multiplication")
    public int multiplicationreq(@RequestParam int a , @RequestParam int b){
        int mul=a*b;
        return mul;
    }
    // Divide End Point Pathvariable
    @RequestMapping("/divide/{a}/{b}")
    public int divide(@PathVariable int a, @PathVariable int b){
        int div=a/b;
        return div;
    }
    // Divide End Point RequestParam
    @RequestMapping("/divide")
    public int dividereq(@RequestParam int a , @RequestParam int b){
        int div=a/b;
        return div;
    }
}
