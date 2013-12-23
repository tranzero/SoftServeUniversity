package com.exercises.Task554;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tranzero
 * 
 */

/**
 * <p>���� ����� ������ 554.</p>
 * 
 */ 
public class PifagorTrio {
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - <code>a</code>.</p>
	 */ 
	private List <Integer> a = new ArrayList<>();
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - <code>b</code>.</p>
	 */
	private List <Integer> b = new ArrayList<>();
	
	/**
	 * <p>��������  � ��� ���������� ���� �� �������� - <code>c</code>.</p>>
	 */
	private List <Integer> c = new ArrayList<>();
	
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
		
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int z = 1; z <= n; z++) {
					if ((((int) Math.pow(i, 2) + (int) Math.pow(j, 2)) 
							== (int) Math.pow(z, 2)) && (i <= j) && (j <= z)) {
						a.add(i);
						b.add(j);
						c.add(z);
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
			System.out.print(i + 1 + ")     ");
			System.out.print(a.get(i) + "     ");
			System.out.print(b.get(i) + "     ");
			System.out.println(c.get(i) + "    ");
			
		}
	}
	
}
