package com.springexpressionL;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringExpressionL {

	public static void main(String[] args) {
	
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("'Hello World'");
		String msg=  (String) exp.getValue();
		System.out.println("Message");
	}

}
