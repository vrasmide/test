package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(" com.example.demo")
public class SpringRestAss2Q2eApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAss2Q2eApplication.class, args);
	}

}
