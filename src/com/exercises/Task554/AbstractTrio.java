package com.exercises.Task554;

import java.util.List;

/**
 * 
 * @author tranzero
 *
 */
public abstract class AbstractTrio implements TrioFinder {
	
	/**
	 * Лічильник кількості триплетів.
	 */
	private int count = 0;
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу.</p>
	 * 
	 * @param number - значення числа <code>n</code> відповідно до умови.
	 */
	 public AbstractTrio(final int number) {
		findTrio(number);
		
	}
	
	 /**
		 * <p>Конструктор, в якому вкладена точка входу.</p>
		 * 
		 * @param number - значення числа <code>n</code> відповідно до умови.
		 * @param command - визначає чи виводити триплети на екран
		 */
	public AbstractTrio(final int number, final String command) {
		
		this(number);
		if (command != ("on")) {
		
			System.out.println("Triplets was fond!");
		} else {
			this.printTrio();
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
	
	/**
	 * Сеттер для поля count.
	 * @param counter - лічильник триплетів.
	 */
	public final void setCount(final int counter) {
		
		this.count = counter;
	}
	

}
