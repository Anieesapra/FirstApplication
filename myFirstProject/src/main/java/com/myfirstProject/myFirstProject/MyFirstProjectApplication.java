package com.myfirstProject.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.myfirstProject.*")
public class MyFirstProjectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	
	}
}
