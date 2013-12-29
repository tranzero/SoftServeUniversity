package com.exercises.Task178;

/**
 * 
 * @author tranzero
 *
 *Клас реалізовує батьківський, зокрема умову <code>В</code> задачі 
 *<code>№117</code>
 */
public class ConditionV extends ATask117 {

	/**
	 * nonArgument конструктор.
	 * Викликає nonArgument конструктор батьківського класу.
	 */
	public ConditionV() {
		super();
	}

	/**
	 * <p>Конструктор викликає батьківський з тою ж сигнатурою.</p>
	 * 
	 * @param naturalNumber - змінна кількість ряду натуральних чисел типу long.
	 */
	public ConditionV(final long... naturalNumber) {
		super(naturalNumber);
	}

	/**
	 * <p>Метод реалізовує батьківський</p>
	 * <p>Метод забезпечує перевірку умови 178 в).</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 в);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 в).
	 */
	@Override
	public final boolean condition(final long n) {
		
		if (Math.sqrt(n) % 2 == 0) {
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
		System.out.println("Кількість чисел, квадратами яких є парні числа "
				+ "рівна "
				+ "\"" + super.getCountOfCondition() + "\"");
				
	}
	
}
