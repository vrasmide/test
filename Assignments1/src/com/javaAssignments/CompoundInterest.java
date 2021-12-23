package com.javaAssignments;

import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest {

	public static void main(String[] args) {
		
		  
		Scanner input = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the principal p: ");
	    double p = input.nextDouble();

	    System.out.print("Enter the rate r: ");
	    double r = input.nextDouble();

	    System.out.print("Enter the time t: ");
	    double t = input.nextDouble();

	    System.out.print("Enter number of times interest is compounded n: ");
	    int n = input.nextInt();

	    double interest = p * (Math.pow((1 + r/100), (t * n))) - p;
	    System.out.println("Compound Interest: " + interest);


	    
	  }

	}


