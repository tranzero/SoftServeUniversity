package test.com.exercises.Task178;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



import com.exercises.Task178.ConditionB;
import com.exercises.Task178.PreCondition;

/**
 * 
 * @author tranzero
 *
 * Unit ���� ����� ConditionB.
 */
public class TestConditionB {
	
	/**
	 * ����� ����� ����������� �����.
	 */
	private final long[] testArray = { 3, 8};
	
	/**
	 * ��'��� ConditionB.
	 */
	private PreCondition cond = null;
	
	/**
	 * ������������� ��'��� ConditionB.
	 * 
	 */
	@Before
	public final void setUp()  {
		
		
		cond = new ConditionB(testArray);
		cond = new ConditionB();
		
	}

	/**
	 * ���� condition(final long n)), ���� ��� ����� ����� 
	 * ���������� <code>true</code>.
	 */
	@Test
	public final void testConditionIfFirstAndSecondBlocksIsTrue() {
		
		final int goodNumber = 3;
		boolean condis = cond.condition(goodNumber);
		boolean expected = true;
		assertEquals(expected, condis);
		assertTrue(condis);
	}
	
	/**
	 * ���� condition(final long n)), ���� ��� ����� ����� 
	 * ���������� <code>false</code>.
	 */
	@Test
	public final void testConditionIfFirstAndSecondBlocksIsFalse() {
		
		final int frongNumber = 5;
		boolean condis = cond.condition(frongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	/**
	 * ���� condition(final long n)), ���� ������ ���� ����� 
	 * ������� <code>true</code>, � ������  - <code>false</code>.
	 */
	@Test
	public final void testConditionIfFirstBlockIsTrueAndSecondBlocksIsFalse() {
		
		final int wrongNumber = 15;
		boolean condis = cond.condition(wrongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	/**
	 * ���� condition(final long n)), ���� ������ ���� ����� 
	 * ������� <code>false</code>, � ������  - <code>true</code>.
	 */
	@Test
	public final void testConditionIfFirstBlockIsFalseAndSecondBlocksIsTrue() {
		
		final int wrongNumber = 4;
		boolean condis = cond.condition(wrongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	/**
	 * ���� countNaturalForCondition(final long... naturalArray). 
	 * �������� ��������� ��������� ��� ����������� ���������� �����.
	 */
	@Test
	public final void testCountNaturalForCondition() {
		final int goodNumber = 3; 
		int expected = cond.getCountOfCondition() + 1;
		cond.countNaturalForCondition(goodNumber);
		int count = cond.getCountOfCondition();
		assertEquals(expected, count);
		
	}

}
