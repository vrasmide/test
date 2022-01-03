package com.bankAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainAcc {

	public static ApplicationContext context;
	public static void main(String[] args) {
		
		context=new ClassPathXmlApplicationContext("beansAcc.xml");
		
	BankAccount acc=
			(BankAccount) context.getBean("BankAccount");
	acc.getAccountId();
	acc.getAccountHolderName();
	acc.getAccountBalance();
	acc.getAccountType();
	

	}

}
