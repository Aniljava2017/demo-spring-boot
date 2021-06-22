package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    ArrayList<Employee> list=new ArrayList<Employee>();
   // End Point one
    @RequestMapping("/add_emp")
    // Use @Requestbody
    public String employee(@RequestBody Employee employee){
        // Employee employee=new Employee("Anil",29,"manager");
        list.add(employee);
        return "employee added with name"+employee.getName();
    }
    // End Point Second
    @RequestMapping ("/get_emp")
    public ArrayList getElement(){
        return list;
    }
    // End Point Third
    @RequestMapping ("/update_emp")
    public String updateElement(){
        list.get(0).setName("Munesh");
        return "Updated name is"+list.get(0).getName();
    }
    // End Point Four
    @RequestMapping ("/remove_emp")
    public String removeElement(){
        list.remove(0);
        return "Element Deleted";
    }
}
