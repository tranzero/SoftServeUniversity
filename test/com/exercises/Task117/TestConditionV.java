package com.exercises.Task117;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConditionV extends ConditionV {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCondition() {
		final long i = 16;
		final long j = 5;
		final ConditionV cond = new ConditionV(i, j);
		boolean condis = cond.condition(i);
		assertEquals(condis, true);
		assertTrue(condis);
		condis = cond.condition(j);
		assertEquals(condis, false);
		assertFalse(condis);
	}

}
