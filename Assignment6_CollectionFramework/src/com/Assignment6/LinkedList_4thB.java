package com.Assignment6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.*;

public class LinkedList_4thB {

		public static void main(String[] args) {
			LinkedList<Date1> l=new LinkedList<>();
			Date1 d1=new Date1(21,11,1997);
			Date1 d2=new Date1(18,3,1992);
			Date1 d3=new Date1(29,11,1994);
			Date1 d4=new Date1(23,12,2001);
			
			l.add(d1);
			l.add(d2);
			l.add(d3);
			l.add(d4);
			
			System.out.println("\n\nBefore reversing :");
			for(Date1 d:l) {
				System.out.println("\nDate: "+d.date+"-"+d.month+"-"+d.year);
				System.out.println("Leap Year:"+d.leapYear());
				
			}  
				Collections.reverse(l);
			System.out.println("\n\nAfter reversing :");
			
			for(Date1 b:l) {
				System.out.println(""+"\nDate: "+b.date+"-"+b.month+"-"+b.year);
				
			}
			
		}

	}
	 class Date1{
		
		int date,month,year;
		public  Date1(int date,int month,int year) {
			this.date=date;
			this.month=month;
			this.year=year;
		}
		int getDate() {
			return this.date;
		}
		int getMonth() {
			return this.month;
		}
		int getYear() {
			return this.year;
		}
		boolean leapYear() {
		return ((this.year%4==0)&&(this.year%100!=0)||(this.year%400==0)) ;
		}
		
		
	}
	



