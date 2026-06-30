package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //required when you want to create bean or object of the specific class
@Scope("prototype") //by default the scope of the object is singleton, in prototype a new instance is created each time bean is requested


/*
Bean Lifecycle
-Ioc instantiates the class using class constructor or setter function.
if a method is being annotated @PostConstruct, then this method is called after the bean is fully initialized
@PreDestroy Method Before the bean is destroyed, the container calls the method annotated with @PreDestroy, allowing the bean to release any resources it holds.
Finally, the container destroys the bean, freeing up memory.
 */
public class MyClass {
    public void display(){
        System.out.println("Dependency Injection working");
    }
}
