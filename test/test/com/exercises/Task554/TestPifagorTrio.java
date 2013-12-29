package test.com.exercises.Task554;
/**
 * @author tranzero
 */


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.exercises.Task554.PifagorTrio;
import com.exercises.Task554.TrioFinder;

/**
 * 
 * ���� ����� {@link PifagorTrio}.
 *
 */
public class TestPifagorTrio {
	
	/**
	 * ��'��� {@link PifagorTrio}.
	 */
	private TrioFinder pifThree = null;
	
	/**
	 * 
	 * ����� before.
	 * �������� ��'��� {@link PifagorTrio}
	 */
	@Before
	public final void setUp() {
		final int inputNumber = 5;
		final String command = "off";
		pifThree = new PifagorTrio(inputNumber, command);
	}

	/**
	 * ���� �� ������� � �������� 1 ��������.
	 */
	@Test
	public final void testFindPifagorTrioFirstTriplet() {
		final int expected = 3;
		int actual = (int) pifThree.getFirstTriplet().get(0);
		assertEquals(expected, actual);
		
	}
	
	/**
	 * ���� �� ������� � �������� 2 ��������.
	 */
	@Test
	public final void testFindPifagorTrioSecondTriplet() {
		final int inputNumber = 5;
		final String command = "on";
		pifThree = new PifagorTrio(inputNumber, command);
		final int expected = 4;
		int actual = (int) pifThree.getSecondTriplet().get(0);
		assertEquals(expected, actual);
		
	}
	
	/**
	 * ���� �� ������� � �������� 3 ��������.
	 */
	@Test
	public final void testFindPifagorTrioThirdTriplet() {
		final int inject = 5;
		pifThree = new PifagorTrio(inject);
		final int expected = 5;
		int actual = (int) pifThree.getThirdTriplet().get(0);
		assertEquals(expected, actual);
		
	}
	
	/**
	 * ���� �� �� ��������� �������� ��� �������� �������.
	 */
	@Test
	public final void testNoAddWrong() {
		pifThree = new PifagorTrio(0, "on");
		
		
				
	}
	
	/**
	 * ���� �� ��������� ���������.
	 */
	@Test
	public final void testPifagorTrioCount() {
		int expected = 1;
		int actual = pifThree.getCount();
		assertEquals(expected, actual);
		
	}

	

}
