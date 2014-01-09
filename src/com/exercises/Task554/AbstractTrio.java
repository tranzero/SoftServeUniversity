package com.exercises.Task554;

import java.util.List;

/**
 * 
 * @author tranzero
 *
 */
public abstract class AbstractTrio implements TrioFinder {
	
	/**
	 * ˳������� ������� ��������.
	 */
	private int count = 0;
	
	/**
	 * <p>�����������, � ����� �������� ����� �����.</p>
	 * 
	 * @param number - �������� ����� <code>n</code> �������� �� �����.
	 */
	 public AbstractTrio(final int number) {
		findTrio(number);
		System.out.println("Triplets was fond!");
		
	}
	
	 /**
		 * <p>�����������, � ����� �������� ����� �����.</p>
		 * 
		 * @param number - �������� ����� <code>n</code> �������� �� �����.
		 * @param command - ������� �� �������� �������� �� �����
		 */
	public AbstractTrio(final int number, final boolean command) {
		
		this(number);
		if (command) {
			this.printTrio();
			
		} 
	}
	
	
	
	
	/**
	 *  ������ ��� firstTriplet.
	 * @return firstTriplet
	 */
	public final List<Integer> getFirstTriplet() {
		return firstTriplet;
	}
	
	/**
	 *  ������ ��� secondTriplet.
	 * @return secondTriplet
	 */
	public final List<Integer> getSecondTriplet() {
		return secondTriplet;
	}

	/**
	 *  ������ ��� thirdTriplet.
	 * @return thirdTriplet
	 */
	public final List<Integer> getThirdTriplet() {
		return thirdTriplet;
	}

	/**
	 *  ������ ��� ���� count.
	 * @return count - �������� �i��������
	 */
	public final int getCount() {
		return count;
	}
	
	/**
	 * ������ ��� ���� count.
	 * @param counter - �������� ��������.
	 */
	public final void setCount(final int counter) {
		
		this.count = counter;
	}
	

}
