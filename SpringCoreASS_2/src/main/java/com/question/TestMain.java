package com.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	private static ApplicationContext context;
	public static void main(String[] args) {
		
		context=new ClassPathXmlApplicationContext("beansQns.xml");
		
		Question qn=(Question) context.getBean("Question");
		qn.Display();
		qn.getAnswers();
		qn.getMapanswers();
		qn.getSetanswers();
		
	}

}
