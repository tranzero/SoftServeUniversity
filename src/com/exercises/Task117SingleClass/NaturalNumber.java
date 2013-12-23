package com.exercises.Task117SingleClass;



/**
 * @author tranzero
 * 
 */

/**
 * <p>Клас вирішує задачу 178 б) в).</p>
 */
public class NaturalNumber {

	
	/**
	 * <p>Визначає вхідний масив натуральних чисел (для nonArgument 
	 * конструктора).</p>
	 * 
	 */
	private final long[] natural = {1, 2, 3, 4, 55, 16, 78, 64, 555334, 6704};
	
	/**
	 * <p>Визначає лічильник елементів по завданні 178 б).</p>
	 * 
	 */
	private int countOfConditionB = 0;
	
	/**
	 * <p>Визначає лічильник елементів по завданні 178 в).</p>
	 * 
	 */
	private int countOfConditionV = 0;
	
	/**
	 * nonArgument конструктор.
	 */
	public NaturalNumber() {
		countNaturalForCondition(getNatural());
	}
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу.</p>
	 * 
	 * @param naturalNumber - змінна кількість ряду натуральних чисел типу long.
	 */
	public NaturalNumber(final long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	/**
	 * <p>Метод забезпечує перевірку умови 178 б).</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 б);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 б).
	 */
	public final  boolean conditionB(final long n) {
		final long three = 3;
		final long five = 5;
		if ((n % three == 0) && (n % five != 0)) {
			return true;
		}
		
			return false;
		
		
	}

	/**
	 * <p>Метод забезпечує перевірку умови 178 в).</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 в);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 в).
	 */
	public final boolean conditionV(final long n) {
		
		if (Math.sqrt(n) % 2 == 0) {
			return true;
		}
		
			return false;
		
		
		
	}
	
	/**
	 * <p>Метод забезпечує перебір усіх елементів
	 * 		та збирає усю логіку.</p>
	 * 
	 * @param naturalArray - змінна кількість ряду натуральних чисел типу long.
	 * 
	 */
	public final  void countNaturalForCondition(final long... naturalArray) {
		
		
		for (long naturalnumber : naturalArray) {
			
			if (conditionB(naturalnumber)) {
				this.setCountOfConditionB(this.getCountOfConditionB() + 1);
			}
			if (conditionV(naturalnumber)) {
				this.setCountOfConditionV(this.getCountOfConditionV() + 1);
			}
			
		}
		System.out.println("Кількість чисел, які кратні 3 та не кратні 5 рівна "
							+ "\"" + this.getCountOfConditionB() + "\"");
		System.out.println("Кількість чисел, квадратами яких є парні числа "
							+ "рівна "
							+ "\"" + this.getCountOfConditionV() + "\"");
		
	}

	/**
	 * Метод геттер для countOfConditionB.
	 * @return <code>countOfConditionB</code> - значення лічильника для 
	 * умови 178 б)
	 */
	public final int getCountOfConditionB() {
		return countOfConditionB;
	}

	/**
	 * Метод геттер для countOfConditionV.
	 * @return <code>countOfConditionVB</code> - значення лічильника для 
	 * умови 178 в)
	 */
	public final int getCountOfConditionV() {
		return countOfConditionV;
	}
	
	/**
	 * Метод геттер для масиву  natural.
	 * @return <code>natural</code> - значення масиву.
	 */
	public final long[] getNatural() {
		return natural;
	}
	
	/**
	 * Метод сеттер для countOfConditionB.
	 * 
	 * @param nextCount - встановлює значення лічильника
	 */
	public final void setCountOfConditionB(final int nextCount) {
		this.countOfConditionB = nextCount;
	}
	
	/**
	 * Метод сеттер для countOfConditionV.
	 * 
	 * @param nextCount - встановлює значення лічильника
	 */
	public final void setCountOfConditionV(final int nextCount) {
		this.countOfConditionV = nextCount;
	}

	

}

