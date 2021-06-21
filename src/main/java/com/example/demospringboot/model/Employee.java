package com.example.demospringboot.model;

public class Employee {
    String name;
    int age;
    String post;

    // Constractor use

    public Employee(String name, int age, String post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }

    // Use Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
