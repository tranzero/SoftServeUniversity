package com.exercises.Task117;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConditionV {
	
	private long[] testArray = { 16, 9};
	private ConditionV cond = null;
	
	@Before
	public void setUp() throws Exception {
		
		cond = new ConditionV(testArray);
		cond = new ConditionV();
	}


	@Test
	public void testConditionTrue() {
		
		int goodNumber = 16;
		boolean condis = cond.condition(goodNumber);
		boolean expected = true;
		assertEquals(expected, condis);
		assertTrue(condis);
		
	}
	
	@Test
	public void testConditionFalse() {
		
		int wrongNumber = 9;
		boolean condis = cond.condition(wrongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	@Test
	public void testCountNaturalForCondition() {
		int goodNumber = 16; 
		int expected = cond.getCountOfCondition() + 1;
		cond.countNaturalForCondition(goodNumber);
		int count = cond.getCountOfCondition();
		assertEquals(expected, count);
		
	}
}
