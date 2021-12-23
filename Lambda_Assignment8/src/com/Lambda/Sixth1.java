package com.Lambda;
import java.util.ArrayList;
import java.util.Arrays;



	public class Sixth1 
	{
		public static void main(String[] args) throws CloneNotSupportedException
		{
			ArrayList<String> alphabets = 
						new ArrayList<>(Arrays.asList("rashmi", "satish", "naveen"));

			System.out.println(alphabets);

			alphabets.replaceAll( e -> e.toUpperCase() );

			System.out.println(alphabets);
		}



	}
