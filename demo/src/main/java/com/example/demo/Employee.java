package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private String department;
    Employee(){

    }
    public Employee(String name, String department){
        this.name=name;
        this.department=department;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + department);
    }

    
}
