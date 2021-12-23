package com.Assignment4;

public class Arithmetic_exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
try {
	System.out.println(Math.pow(5, 0));
	
	
   }catch(ArithmeticException e) {
	   System.out.println("Divided by zero");
   }
	}

}
