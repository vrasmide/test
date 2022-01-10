package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.demo.Controller,com.example.demo.Dao,com.example.demo.model"})
public class SpringRestEmployee5TrailApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestEmployee5TrailApplication.class, args);
	}

}
