package com.javaAssignments;



public class FallingArmstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 100, rem, sum,tnum;

		    System.out.println("The Armstrong numbers from 100 to 999 are : ");

		    for ( ; i <= 999; i++)
		    {
		        tnum = i;
		        sum = 0;
		        while (tnum > 0)
		        {
		            rem = tnum % 10;
		            sum=sum+rem*rem*rem;
		            tnum = tnum / 10;
		        }
		        if (i == sum)
		           System.out.printf("%d\n", sum);
		    }

}}
