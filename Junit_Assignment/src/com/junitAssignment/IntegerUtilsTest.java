package com.junitAssignment;


import org.junit.jupiter.api.Test;

class IntegerUtilsTest
{

	int[]a=new int[] {9,2,7,4,56,1,8};
	@Test
	public void testMaxValue() 
	{
		int max=IntegerUtils.MaxValue(a);
		assert(max==56);
		System.out.println("max test pass");
	}
	@Test
	public void testMinValue() 
	{
		int min=IntegerUtils.MinValue(a);
		assert(min==1);
		System.out.println("min test pass");
	}
}

