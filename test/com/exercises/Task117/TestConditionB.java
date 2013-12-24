package com.exercises.Task117;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConditionB {
	
	private long[] testArray = { 3, 8};
	private ConditionB cond = null;
	
	@Before
	public void setUp() throws Exception {
		
		cond = new ConditionB(testArray);
		cond = new ConditionB();
	}

	
	@Test
	public void testConditionIfFirstAndSecondBlocksIsTrue() {
		
		int goodNumber = 3;
		boolean condis = cond.condition(goodNumber);
		boolean expected = true;
		assertEquals(expected, condis);
		assertTrue(condis);
		
		
		
		condis = cond.condition(4);
		assertFalse(condis);
		
		
		
	}
	
	@Test
	public void testConditionIfFirstAndSecondBlocksIsFalse() {
		
		int frongNumber = 5;
		boolean condis = cond.condition(frongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	@Test
	public void testConditionIfFirstBlockIsTrueAndSecondBlocksIsFalse() {
		
		int wrongNumber = 15;
		boolean condis = cond.condition(wrongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	@Test
	public void testConditionIfFirstBlockIsFalseAndSecondBlocksIsTrue() {
		
		int wrongNumber = 4;
		boolean condis = cond.condition(wrongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	@Test
	public void testCountNaturalForCondition() {
		int goodNumber = 3; 
		int expected = cond.getCountOfCondition() + 1;
		cond.countNaturalForCondition(goodNumber);
		int count = cond.getCountOfCondition();
		assertEquals(expected, count);
		
	}

}
