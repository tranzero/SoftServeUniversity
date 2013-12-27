package test.com.exercises.Task554;
/**
 * @author tranzero
 */


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.exercises.Task554.PifagorTrio;

/**
 * 
 * Тест класу {@link PifagorTrio}.
 *
 */
public class TestPifagorTrio {
	
	/**
	 * Об'экт {@link PifagorTrio}.
	 */
	private PifagorTrio pifThree = null;
	
	/**
	 * 
	 * Метод before.
	 * Ініціалізує об'єкт {@link PifagorTrio}
	 */
	@Before
	public final void setUp() {
		final int inputNumber = 5;
		pifThree = new PifagorTrio(inputNumber);
	}

	/**
	 * Тест на вставку в колекцію 1 триплета.
	 */
	@Test
	public final void testFindPifagorTrioFirstTriplet() {
		final int expected = 3;
		int actual = (int) pifThree.getFirstTriplet().get(0);
		assertEquals(expected, actual);
		
	}
	
	/**
	 * Тест на вставку в колекцію 2 триплета.
	 */
	@Test
	public final void testFindPifagorTrioSecondTriplet() {
		final int expected = 4;
		int actual = (int) pifThree.getSecondTriplet().get(0);
		assertEquals(expected, actual);
		
	}
	
	/**
	 * Тест на вставку в колекцію 3 триплета.
	 */
	@Test
	public final void testFindPifagorTrioThirdTriplet() {
		
		final int expected = 5;
		int actual = (int) pifThree.getThirdTriplet().get(0);
		assertEquals(expected, actual);
		
	}
	
	/**
	 * Тест на IndexOutOfBoundsException.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public final void testFindPifagorTrioIndexOutOfBoundsException() {
		pifThree = new PifagorTrio(2);
		int expected = 0;
		int actual = pifThree.getFirstTriplet().get(0);
		assertEquals(expected, actual);
			
	}
	
	/**
	 * Тест на збільшення лічильника.
	 */
	@Test
	public final void testPifagorTrioCount() {
		int expected = 1;
		int actual = pifThree.getCount();
		assertEquals(expected, actual);
		
	}

	

}
