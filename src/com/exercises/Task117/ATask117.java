/**
 * 
 */
package com.exercises.Task117;

/**
 * @author tranzero
 *
 */
public abstract class ATask117 {

	/**
	 * <p>Визначає вхідний масив натуральних чисел (для nonArgument 
	 * конструктора).</p>
	 * 
	 */
	private final long[] natural = {1, 2, 3, 4, 55, 16, 78, 64, 555334, 6704};
	
	/**
	 * <p>Визначає лічильник елементів.</p>
	 * 
	 */
	private int countOfCondition = 0;
	
		
	/**
	 * nonArgument конструктор.
	 */
	public ATask117() {
		countNaturalForCondition(getNatural());
	}
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу.</p>
	 * 
	 * @param naturalNumber - змінна кількість ряду натуральних чисел типу long.
	 */
	public ATask117(final long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	
	
	
	/**
	 * Метод геттер для масиву  natural.
	 * @return <code>natural</code> - значення масиву.
	 */
	public final long[] getNatural() {
		return natural;
	}
	
	/**
	 * Метод геттер для countOfCondition.
	 * @return <code>countOfCondition</code> - значення лічильника
	 */
	public final int getCountOfCondition() {
		return countOfCondition;
	}

	/**
	 * Метод сеттер для countOfCondition.
	 * 
	 * @param counter - встановлює значення лічильника
	 */
	public final void setCountOfCondition(final int counter) {
		this.countOfCondition = counter;
	}

	/**
	 * <p>Абстрактний метод, який повинен забезпечувати перебір усіх елементів
	 * 		та збирати усю логіку.</p>
	 * 
	 * @param naturalArray - змінна кількість ряду натуральних чисел типу long.
	 * 
	 */
	public abstract void countNaturalForCondition(long... naturalArray);
	
	/**
	 * <p>Абстрактний метод, який повинен перевіряти умову вказану в задачі.</p>
	 * 
	 @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову;
	 *		   <code>false</code> - якщо число не задовільняє умову.
	 */
	public abstract boolean condition(final long n);


}
