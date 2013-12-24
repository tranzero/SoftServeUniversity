package com.exercises.Task117;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConditionV extends ConditionV {
	
	private long i = 16;
	private long j = 5;
	private ConditionV cond = null;

	@Before
	public void setUp() throws Exception {
		cond = new ConditionV(i, j);
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
