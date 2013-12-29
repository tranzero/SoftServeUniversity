package com.exercises.Task554;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author tranzero
 *
 */
public interface TrioFinder {
	
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - 
	 * <code>firstTriplet</code>.</p>
	 */ 
	 List <Integer> firstTriplet = new ArrayList<>();
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - 
	 * <code>secondTriplet</code>.</p>
	 */
	 List <Integer> secondTriplet = new ArrayList<>();
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - 
	 * <code>thirdTriplet</code>.</p>>
	 */
	 List <Integer> thirdTriplet = new ArrayList<>();
	 
	 /**
		 * <p>����� ��������� ����� ��� �������� �������� �� 
		 * 		�������� �������� ��������.</p>
		 * 
		 * @param n - �������� ����� <code>n</code> �������� �� �����.
		 * 
		 */
	 void findTrio(final int n);
	 
	 /**
		 * <p>����� ��������� ���� � ������� ��� �������� �������� �� 
		 * 		��'��� ��� �����.</p>
		 * 
		 * 
		 */
	void printTrio();
	
	/**
	 * <p>����� �������� �����.</p>
	 * 
	 * @param a - first number
	 * 
	 * @param b - second number
	 * 
	 * @param c - third number
	 * 
	 * @return <code>true</code>; <code>false</code>
	 * 
	 * 
	 */
	boolean condition(int a, int b, int c);
	
	/**
	 * ������ ��� {@link #firstTriplet}.
	 * @return �������� {@link #firstTriplet}.
	 */
	List<Integer> getFirstTriplet();
	
	/**
	 * ������ ��� {@link #secondTriplet}.
	 * @return �������� {@link #secondTriplet}.
	 */
	List<Integer> getSecondTriplet();
	
	/**
	 * ������ ��� {@link #thirdTriplet}.
	 * @return �������� {@link #thirdTriplet}.
	 */
	List<Integer> getThirdTriplet();
	
	/**
	 * ������ ��� ��������� ��������.
	 * @return ������� �������� ���������.
	 */
	int getCount();

}
