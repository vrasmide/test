package com.Assignment6;

import java.util.HashSet;
import java.util.Iterator;

public class Uniqueproducts10_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<String>();
		h.add("1");
		h.add("2");
		h.add("10");
		h.add("3");
		h.add("4");
		h.add("4");
		h.add("5");
		h.add("6");
		h.add("7");
		h.add("8");
		h.add("9");
		h.add("10");
		
		Iterator<String> itr=h.iterator();
		System.out.println("unique numbers:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
