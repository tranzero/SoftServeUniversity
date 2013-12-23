package com.exercises.Task117;

/**
 * 
 * @author tranzero
 *
 *Клас реалізовує батьківський, зокрема умову <code>Б</code> задачі 
 *<code>№117</code>
 */
public class ConditionB extends ATask117 {
	
	/**
	 * nonArgument конструктор.
	 * Викликає nonArgument конструктор батьківського класу.
	 */
	public ConditionB() {
		super();
	}
	
	/**
	 * <p>Конструктор викликає батьківський з тою ж сигнатурою.</p>
	 * 
	 * @param naturalNumber - змінна кількість ряду натуральних чисел типу long.
	 */
	public ConditionB(final long... naturalNumber) {
		super(naturalNumber);
	}
		
	/**
	 * <p>Метод реалізовує батьківський</p>
	 * <p>Метод забезпечує перевірку умови 178 б).</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 б);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 б).
	 */
	@Override
	public final  boolean condition(final long n) {
		final long three = 3;
		final long five = 5;
		if ((n % three == 0) && (n % five != 0)) {
			return true;
		}
		
			return false;
		
		
	}

	/**
	 * <p>Реалізовує батьківський. Забезпечує перебір усіх елементів
	 * 		та збирає усю логіку.</p>
	 * 
	 * @param naturalArray - змінна кількість ряду натуральних чисел типу long.
	 * 
	 */
	@Override
	public final void countNaturalForCondition(final long... naturalArray) {
			
		for (long naturalnumber : naturalArray) {
			
			if (this.condition(naturalnumber)) {
				super.setCountOfCondition(super.getCountOfCondition() + 1);
			}
						
		}
		System.out.println("Кількість чисел, які кратні 3 та не кратні 5 рівна "
							+ "\"" + super.getCountOfCondition() + "\"");
				
	}

}
