package com.exercises.Task117;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConditionB extends ConditionB {
	
	private long i = 3;
	private long j = 5;
	private ConditionB cond = null;
	
	@Before
	public void setUp() throws Exception {
		
		cond = new ConditionB(i, j);
	}

	
	@Test
	public void testCondition() {
		
		boolean condis = cond.condition(i);
		assertEquals(condis, true);
		assertTrue(condis);
		condis = cond.condition(j);
		assertEquals(condis, false);
		assertFalse(condis);
		
	}

}
