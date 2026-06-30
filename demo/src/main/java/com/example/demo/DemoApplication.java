package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	/*
	Spring is a famous framework for building java applications. But as spring evolved, developers began to 
face certain challenges, expecially for its configurations and setup. To deal with this problem 
Spring boot was developed which an extention of Spring, easier version and helps to deply
spring applications.

Challenges with spring framework-
extensive confiquiration
project setup
versions conflict

Why Spring Boot-
-Simplified Configuration-
Spring Boot was developed to deal with confiquration and setup challenges faced in traditional 
spring framework. Spring Boot provides default settings and automatic configurations, 
which handles most use cases we did not have to manually set the configurations.
-Embedded Servers-
In traditional Spring frameswork, developers had to deploy their applications in external Servers
like tomcat or jetty, in order to run it, but spring boot provides embedded server within the application itself,
which means you can package you entire application in an executable file (like a JAR) and run it without 
installing a separate server.
ex- you can run your application using java -jar myapp.jar command and it will start an embedded tomcat server.
-Simplified dependency Management-
Spring boot includes starter templates, which group together all the dependencies that cover most use cases,
in order to built web, security.
Ex-Instead of adding individual dependencies, you can use spring-boot-stater-app, and it will 
include everything required to built a web app.
-Production-Ready features
Uing spring boot actuators you can easily montior your application health, memory usage, performance and metrics.
-Microservices and Cloud-Native
Using spring boot you can create small microservice which can be independently deployed and scaled.




	 */
	/*Commandlinerunner is an interface which allows the user to run the code just after the application 
	has started. Suppose if youu want to add admin data in the database or any other default data in the database
	which has to be there soon after the application is initialized you have to call it right
	UserService.createAdminUser();
	but if you implement commandlinerunner that stuffs is called by spring explicitely after application
	has initiated

	Remember- port numbers or any databse settings can be done in target->classes-<applicationproperties
	*/

	private MyClass myclass;
	public static void main(String[] args) {
		//here we are using the object of the Myclass directly without calling or creating any container
		SpringApplication.run(DemoApplication.class, args); //when spring initiates the application, it creates objects and calls them


		//using applicationcontext
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee=context.getBean(Employee.class);
		employee.display();
	}

	public DemoApplication(MyClass myclass){
		this.myclass=myclass;
	}
 //spring starts the application
	@Override
	public void run(String... arg) throws Exception{
		myclass.display();
	}
	

}
