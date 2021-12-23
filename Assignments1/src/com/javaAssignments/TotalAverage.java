package com.javaAssignments;

import java.util.Scanner;

public class TotalAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int markArray[] = new int[3];
	        int i;
	        float sum=0;
	        float average;
	        Scanner scan = new Scanner(System.in);
	 
	        System.out.print("Enter marks for 3 Subjects : ");
	        for(i=0; i<3; i++){
	            markArray[i] = scan.nextInt();
	            sum = sum + markArray[i];
	        }
	 
	        average = sum/3;
	        System.out.print("Average Marks = " +average);
	 
	        System.out.print("\ntotal = " +sum+ "%");
	  
	}

}
