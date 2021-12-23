package com.Assignment3;

public class Insert_word_SBFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="insert text";
		
		StringBuffer str1= new StringBuffer("It is used to  at the specified index position");
		//int index= str1.indexOf("_");
		//str1.insert(index,"insert text");
		str1.insert(14, "insert text");
		System.out.println("After insertion: "+str1);

	}

}
