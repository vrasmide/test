package com.Lambda;

import java.util.ArrayList;
import java.util.Arrays;


public class OddLength_4th {
	interface Stringlength{
		int getLength(String str);
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
	ArrayList<String> names = new ArrayList<>(Arrays.asList("rashmi","Satish","Naveen","sai"));

	names.removeIf((String str)-> str.length()%2 == 1 );

	System.out.println(names);
	}
}