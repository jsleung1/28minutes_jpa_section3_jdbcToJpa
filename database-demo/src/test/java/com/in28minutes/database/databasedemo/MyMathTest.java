package com.in28minutes.database.databasedemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@Test
	void sum_with3numbers() {
		System.out.println("sum_with3numbers");
		
		// fail("Not yet implemented");
		
		MyMath myMath = new MyMath();
		int result = myMath.sum( new int[] { 1, 2, 3 });
		assertEquals( 6, result );
		// assertTrue( )
		// assertArrayEquals()
	}

	@Test
	void test2() {
		// fail("Not yet implemented");
		
		System.out.println("Test2");
	}
	
}
