package com.exercises.Task554;
/**
 * @author tranzero
 * 
 */
import java.io.Serializable;

/**
 * <p>���� ����� ������ 554.</p>
 * 
 */ 
public class PifagorTrio extends AbstractTrio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * <p>�����������, � ����� �������� ����� �����.</p>
	 * 
	 * @param number - �������� ����� <code>n</code> �������� �� �����.
	 */
	public PifagorTrio(final int number) {
		super(number);
	}
	
	/**
	 * <p>�����������, � ����� �������� ����� �����.</p>
	 * 
	 * @param number - �������� ����� <code>n</code> �������� �� �����.
	 * @param command - ������� �� �������� �������� �� �����
	 */
	public PifagorTrio(final int number, final String command) {
		super(number, command);
	}
	
	/**
	 * <p>����� ��������� ����� ��� �������� �������� �� 
	 * 		�������� �������� ��������.</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
	 * 
	 */
	@Override
	public final void findTrio(final int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int z = 1; z <= n; z++) {
					if (condition(i, j, z)) {
						getFirstTriplet().add(i);
						getSecondTriplet().add(j);
						getThirdTriplet().add(z);
						super.setCount(getCount() + 1);
					}
				}
			}
		}
	}
	
	/**
	 * <p>����� ��������� ���� � ������� ��� �������� �������� �� 
	 * 		��'��� ��� �����.</p>
	 * 
	 */
	@Override
	public final void printTrio() {
		if (super.getCount() > 0) {
		System.out.println("�      a     b     c     ");
		for (int i = 0; i < super.getCount(); i++) {
			System.out.print(i + ")     ");
			System.out.print(getFirstTriplet().get(i) + "     ");
			System.out.print(getSecondTriplet().get(i) + "     ");
			System.out.println(getThirdTriplet().get(i) + "    ");
		}
		} else {
			System.out.println("This number don't have triplets.");
		}
	}

	@Override
	public final boolean condition(final int first, final int second, 
									final int third) {
		
		if ((((int) Math.pow(first, 2) + (int) Math.pow(second, 2)) 
				== (int) Math.pow(third, 2)) && (first <= second) 
				&& (second <= third)) {
			return true;
		}
		return false;
	}
	
	
}
