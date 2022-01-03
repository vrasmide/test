package com.assignment9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHelloWorld {

	public static void main(String[] args)
	        
	  {
	 
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext(
	                "beanHelloWorld.xml");
	 
	       
	        cap.close();
	    }
	}

