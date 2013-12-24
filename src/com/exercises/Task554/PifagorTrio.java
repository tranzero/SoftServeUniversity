package com.exercises.Task554;
/**
 * @author tranzero
 * 
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Клас вирішує задачу 554.</p>
 * 
 */ 
public class PifagorTrio implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <p>Колекція  в якій зберігається один із триплетів - 
	 * <code>firstTriplet</code>.</p>
	 */ 
	 private List <Integer> firstTriplet = new ArrayList<>();
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - 
	 * <code>secondTriplet</code>.</p>
	 */
	 private List <Integer> secondTriplet = new ArrayList<>();
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - 
	 * <code>thirdTriplet</code>.</p>>
	 */
	 private List <Integer> thirdTriplet = new ArrayList<>();
	
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
			System.out.print(i + ")     ");
			System.out.print(getFirstTriplet().get(i) + "     ");
			System.out.print(getSecondTriplet().get(i) + "     ");
			System.out.println(getThirdTriplet().get(i) + "    ");
		}
	}
	
	/**
	 *  Геттер для firstTriplet.
	 * @return firstTriplet
	 */
	public final List<Integer> getFirstTriplet() {
		return firstTriplet;
	}
	
	/**
	 *  Геттер для secondTriplet.
	 * @return secondTriplet
	 */
	public final List<Integer> getSecondTriplet() {
		return secondTriplet;
	}

	/**
	 *  Геттер для thirdTriplet.
	 * @return thirdTriplet
	 */
	public final List<Integer> getThirdTriplet() {
		return thirdTriplet;
	}

	/**
	 *  Геттер для поля count.
	 * @return count - значення лычильника
	 */
	public final int getCount() {
		return count;
	}
}
