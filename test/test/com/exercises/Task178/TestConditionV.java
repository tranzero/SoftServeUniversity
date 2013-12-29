package test.com.exercises.Task178;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



import com.exercises.Task178.ConditionV;
import com.exercises.Task178.PreCondition;

/**
 * 
 * @author tranzero
 *
 * Unit ���� ����� ConditionB.
 */
public class TestConditionV {
	
	/**
	 * ����� ����� ����������� �����.
	 */
	private final long[] testArray = { 16, 9};
	
	/**
	 * ��'��� ConditionB.
	 */
	private PreCondition cond = null;
	
	/**
	 * ������������ ��'��� ConditionB.
	 * 
	 */
	@Before
	public final void setUp() {
		
		cond = new ConditionV(testArray);
		cond = new ConditionV();
	}

	/**
	 * ���� condition(final long n)), ���� ���� ����� 
	 * ������� <code>true</code>.
	 */
	@Test
	public final void testConditionTrue() {
		
		final int goodNumber = 16;
		boolean condis = cond.condition(goodNumber);
		boolean expected = true;
		assertEquals(expected, condis);
		assertTrue(condis);
		
	}
	
	/**
	 * ���� condition(final long n), ���� ���� ����� 
	 * ������� <code>false</code>.
	 */
	@Test
	public final void testConditionFalse() {
		
		final int wrongNumber = 9;
		boolean condis = cond.condition(wrongNumber);
		boolean expected = false;
		assertEquals(expected, condis);
		assertFalse(condis);
	}
	
	/**
	 * ���� countNaturalForCondition(final long... naturalArray). 
	 * �������� ��������� ��������� ��� ����������� ��������� �����.
	 */
	@Test
	public final void testCountNaturalForCondition() {
		final int goodNumber = 16; 
		int expected = cond.getCountOfCondition() + 1;
		cond.countNaturalForCondition(goodNumber);
		int count = cond.getCountOfCondition();
		assertEquals(expected, count);
		
	}
}
