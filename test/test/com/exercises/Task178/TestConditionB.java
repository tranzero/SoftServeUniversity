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
 * Unit тест класу ConditionB.
 */
public class TestConditionB {
	
	/**
	 * Масив вводу натуральних чисел.
	 */
	private final long[] testArray = { 3, 8};
	
	/**
	 * Об'єкт ConditionB.
	 */
	private PreCondition cond = null;
	
	/**
	 * Ініціалізовуємо об'єкт ConditionB.
	 * 
	 */
	@Before
	public final void setUp()  {
		
		
		cond = new ConditionB(testArray);
		cond = new ConditionB();
		
	}

	/**
	 * Тест condition(final long n)), коли оба блоки умови 
	 * повертають <code>true</code>.
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
	 * Тест condition(final long n)), коли оба блоки умови 
	 * повертають <code>false</code>.
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
	 * Тест condition(final long n)), коли перший блок умови 
	 * повертає <code>true</code>, а другий  - <code>false</code>.
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
	 * Тест condition(final long n)), коли перший блок умови 
	 * повертає <code>false</code>, а другий  - <code>true</code>.
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
	 * Тест countNaturalForCondition(final long... naturalArray). 
	 * Перевірка збільшення лічильника при позитивному проходенні умови.
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
