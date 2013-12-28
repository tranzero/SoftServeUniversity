/**
 * 
 */
package com.exercises.Task117;

/**
 * @author tranzero
 *
 */
public interface PreCondition {
	
	/**
	 * <p>Забезпечує перебір усіх елементів
	 * 		та збирає усю логіку.</p>
	 * 
	 * @param naturalArray - змінна кількість ряду натуральних чисел типу long.
	 * 
	 */
	void countNaturalForCondition(long... naturalArray);
	
	/**
	 * 
	 * <p>Метод забезпечує перевірку умови 178 б).</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 б);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 б).
	 */
	boolean condition(final long n);

}
