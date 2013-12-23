package com.exercises.Task554;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tranzero
 * 
 */

/**
 * <p>Клас вирішує задачу 554.</p>
 * 
 */ 
public class PifagorTrio {
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - <code>a</code>.</p>
	 */ 
	private List <Integer> a = new ArrayList<>();
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - <code>b</code>.</p>
	 */
	private List <Integer> b = new ArrayList<>();
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - <code>c</code>.</p>>
	 */
	private List <Integer> c = new ArrayList<>();
	
	/**
	 * Лічильник кількості триплетів.
	 */
	private int count = 0;
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу.</p>
	 * 
	 * @param n - значення числа <code>n</code> відповідно до умови.
	 */
	public PifagorTrio(final int n) {
		printPifagorTrio(n);
	}
	
	/**
	 * <p>Метод забезпечує пошук усіх можливих триплетів та 
	 * 		заповнює колекції триплетів.</p>
	 * 
	 * @param n - значення числа <code>n</code> відповідно до умови.
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
	 * <p>Метод забезпечує вивід у консоль усіх можливих триплетів та 
	 * 		зв'язує усю логіку.</p>
	 * 
	 * @param n - значення числа <code>n</code> відповідно до умови.
	 * 
	 */
	public final void printPifagorTrio(final int n) {
		findPifagorTrio(n);
		System.out.println("№      a     b     c     ");
		for (int i = 0; i < count; i++) {
			System.out.print(i + 1 + ")     ");
			System.out.print(a.get(i) + "     ");
			System.out.print(b.get(i) + "     ");
			System.out.println(c.get(i) + "    ");
			
		}
	}
	
}
