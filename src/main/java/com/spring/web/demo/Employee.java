package com.spring.web.demo;

public class Employee {
    private final int id;
    private final String name;
    private final int age;
    private final String gender;

    public Employee(int id, String name, int age, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
