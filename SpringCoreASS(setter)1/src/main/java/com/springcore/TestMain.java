package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		 context=new ClassPathXmlApplicationContext("beans.xml");
		
		Address address=(Address) context.getBean("Address");
		address.display();
		
		Customer customer=(Customer) context.getBean("Customer");
		customer.display();
	}

}
