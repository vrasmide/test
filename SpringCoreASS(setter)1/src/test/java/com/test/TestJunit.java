package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.springcore.Address;

public class TestJunit {

	public TestJunit(Address add){
		assertEquals(1,add.getStreet());
	}
	
	@Test
	 void set(Address add) {
	
		assertEquals("set(add)",add.getStreet());
	}

}
