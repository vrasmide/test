package com.Assignment3;

public class String_methods_SBFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="Java String pool refers to collection of Strings which are stored in heap memory";
 
 System.out.println("String in lowercase "+str.toLowerCase());
  
  System.out.println("String in upperCase "+str.toUpperCase());
  
  System.out.println("String after replace "+str.replace('a','$'));
  
  System.out.println("The word collection found  "+str.contains("collection"));
  
  String str1="java string pool refers to collection of strings which are stored in heap memory ";
  System.out.println("Matches or not: "+str.matches(str1));
  
 if(str==str1)
  {
	 System.out.println("two strings are matched");
  }
 else
 { System.out.println("Two strings are not matched");
	}

}}
