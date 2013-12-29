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
	 * <p>Колекція  в якій зберігається один із триплетів - 
	 * <code>firstTriplet</code>.</p>
	 */ 
	 List <Integer> firstTriplet = new ArrayList<>();
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - 
	 * <code>secondTriplet</code>.</p>
	 */
	 List <Integer> secondTriplet = new ArrayList<>();
	
	/**
	 * <p>Колекція  в якій зберігається один із триплетів - 
	 * <code>thirdTriplet</code>.</p>>
	 */
	 List <Integer> thirdTriplet = new ArrayList<>();
	 
	 /**
		 * <p>Метод забезпечує пошук усіх можливих триплетів та 
		 * 		заповнює колекції триплетів.</p>
		 * 
		 * @param n - значення числа <code>n</code> відповідно до умови.
		 * 
		 */
	 void findTrio(final int n);
	 
	 /**
		 * <p>Метод забезпечує вивід у консоль усіх можливих триплетів та 
		 * 		зв'язує усю логіку.</p>
		 * 
		 * 
		 */
	void printTrio();
	
	/**
	 * <p>Метод перевірки умови.</p>
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
	 * Геттер для {@link #firstTriplet}.
	 * @return колекцію {@link #firstTriplet}.
	 */
	List<Integer> getFirstTriplet();
	
	/**
	 * Геттер для {@link #secondTriplet}.
	 * @return колекцію {@link #secondTriplet}.
	 */
	List<Integer> getSecondTriplet();
	
	/**
	 * Геттер для {@link #thirdTriplet}.
	 * @return колекцію {@link #thirdTriplet}.
	 */
	List<Integer> getThirdTriplet();
	
	/**
	 * Геттер для лічильника триплетів.
	 * @return поточне значення лічильника.
	 */
	int getCount();

}
