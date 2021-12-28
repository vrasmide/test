package com.junitAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycle5Test {
Math m;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("\nBefore All:This needs to run before ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("\nAfter All: This needs to run after all ");
	}

	@BeforeEach
	void setUp() throws Exception {
		m=new Math();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("\nCleaning up ");
	}

	@Test
	void addition() {
		int expected=6;
		int actual=m.addition(2, 4);
		assertEquals(expected,actual,"\nThe method should add two numbers");
	}
	@Test
	void multiplication() {
		int expected=8;
		int actual=m.multiplication(2, 4);
		assertEquals(expected,actual,"\nThe method should multiply two numbers");
	}

}
