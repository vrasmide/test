package com.javaAssignments;

import java.util.Scanner;

public class SubMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subject1 , subject2, subject3,totalmarks;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter subject1 marks:");
		subject1=s.nextInt();
		
		System.out.println("Enter subject2 marks:");
		subject2=s.nextInt();
		
		System.out.println("Enter subject3 marks:");
		subject3=s.nextInt();
		
		totalmarks=subject1+subject2+subject3;
		
		if((subject1>60)&&(subject2>60)&&(subject3>60))
		{
			System.out.println("passed");
		}
		else if(((subject1>60)&&(subject2>60))||((subject1>60)&&(subject3>60))||((subject2>60)&&(subject3>60))) 
		{
			System.out.println("promoted");
		}
		else if((((subject1>60)&&((subject2<60)&&(subject3<60)))||
				((subject2>60)&&((subject3<60)&&(subject1<60)))||
				((subject3>60)&&((subject2<60)&&(subject1<60)))||(totalmarks<60)))
		{
			System.out.println("failed");
		}
		

	}

}
