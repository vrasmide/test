package com.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		 context=new ClassPathXmlApplicationContext("beansConstructor.xml");
		
		 AddressConstructor address= (AddressConstructor) context.getBean("AddressConstructor");
		address.display();
		
		CustomerConstructor customer= (CustomerConstructor) context.getBean("CustomerConstructor");
		customer.display();
	}

}
