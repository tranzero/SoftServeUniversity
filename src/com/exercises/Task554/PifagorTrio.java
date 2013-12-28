package com.exercises.Task554;
/**
 * @author tranzero
 * 
 */
import java.io.Serializable;

/**
 * <p>Клас вирішує задачу 554.</p>
 * 
 */ 
public class PifagorTrio extends AbstractTrio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * <p>Конструктор, в якому вкладена точка входу.</p>
	 * 
	 * @param number - значення числа <code>n</code> відповідно до умови.
	 */
	public PifagorTrio(final int number) {
		super(number);
	}
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу.</p>
	 * 
	 * @param number - значення числа <code>n</code> відповідно до умови.
	 * @param command - визначає чи виводити триплети на екран
	 */
	public PifagorTrio(final int number, final String command) {
		super(number, command);
	}
	
	/**
	 * <p>Метод забезпечує пошук усіх можливих триплетів та 
	 * 		заповнює колекції триплетів.</p>
	 * 
	 * @param n - значення числа <code>n</code> відповідно до умови.
	 * 
	 */
	@Override
	public final void findTrio(final int n) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int z = 1; z <= n; z++) {
					if (condition(i, j, z)) {
						getFirstTriplet().add(i);
						getSecondTriplet().add(j);
						getThirdTriplet().add(z);
						super.setCount(getCount() + 1);
					}
				}
			}
		}
	}
	
	/**
	 * <p>Метод забезпечує вивід у консоль усіх можливих триплетів та 
	 * 		зв'язує усю логіку.</p>
	 * 
	 */
	@Override
	public final void printTrio() {
		if (super.getCount() > 0) {
		System.out.println("№      a     b     c     ");
		for (int i = 0; i < super.getCount(); i++) {
			System.out.print(i + ")     ");
			System.out.print(getFirstTriplet().get(i) + "     ");
			System.out.print(getSecondTriplet().get(i) + "     ");
			System.out.println(getThirdTriplet().get(i) + "    ");
		}
		} else {
			System.out.println("This number don't have triplets.");
		}
	}

	@Override
	public final boolean condition(final int first, final int second, 
									final int third) {
		
		if ((((int) Math.pow(first, 2) + (int) Math.pow(second, 2)) 
				== (int) Math.pow(third, 2)) && (first <= second) 
				&& (second <= third)) {
			return true;
		}
		return false;
	}
	
	
}
