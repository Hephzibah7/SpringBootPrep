package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //required when you want to create bean or object of the specific class
@Scope("prototype") //by default the scope of the object is singleton, in prototype a new instance is created each time bean is requested

public class MyClass {
    public void display(){
        System.out.println("Dependency Injection working");
    }
}
