package com.javaAssignments;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Income(CTC):");
		int income=s.nextInt();
		
		if((income<180000))
		{
			
			System.out.println("No tax");
		}
		else if((income>=180001)&&(income<300000))
		{
			tax=0.01*(income);
			System.out.println("income tax "+tax);
		}
		else if((income>=300001)&&(income<500000))
		{
			tax=0.02*(income);
			System.out.println("income tax " +tax);
		}
		else if((income>=500001)&&(income<1000000))
		{
			tax=income*(0.03);
			System.out.println("income tax "+tax);
		}
		
		
	}

}
