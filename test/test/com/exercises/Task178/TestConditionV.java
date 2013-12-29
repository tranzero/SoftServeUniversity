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
 * Unit тест класу ConditionB.
 */
public class TestConditionV {
	
	/**
	 * Масив вводу натуральних чисел.
	 */
	private final long[] testArray = { 16, 9};
	
	/**
	 * Об'єкт ConditionB.
	 */
	private PreCondition cond = null;
	
	/**
	 * Ініціалізовуємо об'єкт ConditionB.
	 * 
	 */
	@Before
	public final void setUp() {
		
		cond = new ConditionV(testArray);
		cond = new ConditionV();
	}

	/**
	 * Тест condition(final long n)), коли блок умови 
	 * повертає <code>true</code>.
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
	 * Тест condition(final long n), коли блок умови 
	 * повертає <code>false</code>.
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
	 * Тест countNaturalForCondition(final long... naturalArray). 
	 * Перевірка збільшення лічильника при позитивному проходенні умови.
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
