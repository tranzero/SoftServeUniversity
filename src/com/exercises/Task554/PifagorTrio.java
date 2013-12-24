package com.exercises.Task554;
/**
 * @author tranzero
 * 
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>���� ����� ������ 554.</p>
 * 
 */ 
public class PifagorTrio implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - 
	 * <code>firstTriplet</code>.</p>
	 */ 
	 private List <Integer> firstTriplet = new ArrayList<>();
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - 
	 * <code>secondTriplet</code>.</p>
	 */
	 private List <Integer> secondTriplet = new ArrayList<>();
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - 
	 * <code>thirdTriplet</code>.</p>>
	 */
	 private List <Integer> thirdTriplet = new ArrayList<>();
	
	/**
	 * ˳������� ������� ��������.
	 */
	private int count = 0;

	/**
	 * <p>�����������, � ����� �������� ����� �����.</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
	 */
	public PifagorTrio(final int n) {
		printPifagorTrio(n);
	}
	
	/**
	 * <p>����� ��������� ����� ��� �������� �������� �� 
	 * 		�������� �������� ��������.</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
	 * 
	 */
	public final void findPifagorTrio(final int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int z = 1; z <= n; z++) {
					if ((((int) Math.pow(i, 2) + (int) Math.pow(j, 2)) 
							== (int) Math.pow(z, 2)) && (i <= j) && (j <= z)) {
						getFirstTriplet().add(i);
						getSecondTriplet().add(j);
						getThirdTriplet().add(z);
						this.count++;
					}
				}
			}
		}
	}
	
	/**
	 * <p>����� ��������� ���� � ������� ��� �������� �������� �� 
	 * 		��'��� ��� �����.</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
	 * 
	 */
	public final void printPifagorTrio(final int n) {
		findPifagorTrio(n);
		System.out.println("�      a     b     c     ");
		for (int i = 0; i < count; i++) {
			System.out.print(i + ")     ");
			System.out.print(getFirstTriplet().get(i) + "     ");
			System.out.print(getSecondTriplet().get(i) + "     ");
			System.out.println(getThirdTriplet().get(i) + "    ");
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
	 * @return count - �������� ����������
	 */
	public final int getCount() {
		return count;
	}
}
