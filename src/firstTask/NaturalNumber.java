package firstTask;

/**
 * @author tranzero
 * 
 */

/**
 * <p>Клас вирішує задачу 178 б) в) </p>
 * 
 */
public class NaturalNumber {

	
	/**
	 * <p>Визначає вхідний масив натуральних чисел (для nonArgument 
	 * конструктора)</p>
	 * 
	 */
	private long[] natural = {1, 2, 3, 10, 55, 96, 58, 54555, 555656,
							  4, 8, 9, 65, 98};
	
	/**
	 * <p>Визначає лічильник елементів по завданні 178 б)</p>
	 * 
	 */
	private int countOfConditionB = 0;
	
	/**
	 * <p>Визначає лічильник елементів по завданні 178 в)</p>
	 * 
	 */
	private int countOfConditionV = 0;
	
	public NaturalNumber() {
		countNaturalForCondition(getNatural());
	}
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу</p>
	 * 
	 * @param naturalNumber - змінна кількість ряду натуральних чисел типу long.
	 */
	public NaturalNumber(long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	/**
	 * <p>Метод забезпечує перевірку умови 178 б)</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 б);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 б).
	 */
	public  boolean conditionB (long n){
		if (n%3 == 0 && n%5 != 0)
			return true;
		else
			return false;
		
	}

	/**
	 * <p>Метод забезпечує перевірку умови 178 в)</p>
	 * 
	 * @param n - вхідне натуральне число типу long.
	 * @return <code>true</code> - якщо число задовільняє умову 178 в);
	 *		   <code>false</code> - якщо число не задовільняє умову 178 в).
	 */
	public  boolean conditionV (long n){
		
		if (Math.sqrt(n) % 2 == 0)
			return true;
		else
			return false;
		
		
	}
	
	/**
	 * <p>Метод забезпечує перебір усіх елементів
	 * 		та збирає усю логіку</p>
	 * 
	 * @param naturalArray - змінна кількість ряду натуральних чисел типу long.
	 * 
	 */
	public  void countNaturalForCondition (long... naturalArray){
		
		
		for (long naturalnumber : naturalArray){
			
			if (conditionB(naturalnumber))
				this.setCountOfConditionB(this.getCountOfConditionB()+1);			
			if (conditionV(naturalnumber))
				this.setCountOfConditionV(this.getCountOfConditionV()+1);
			
		}
		System.out.println("Кількість чисел, які кратні 3 та не кратні 5 рівна "
							+"\""+this.getCountOfConditionB()+"\"" );
		System.out.println("Кількість чисел, квадратами яких є парні числа рівна "
							+"\""+this.getCountOfConditionV()+"\"");
		
	}

	public int getCountOfConditionB() {
		return countOfConditionB;
	}

	public int getCountOfConditionV() {
		return countOfConditionV;
	}
		
	public long[] getNatural() {
		return natural;
	}
	
	
	public void setCountOfConditionB(int countOfConditionB) {
		this.countOfConditionB = countOfConditionB;
	}
	public void setCountOfConditionV(int countOfConditionV) {
		this.countOfConditionV = countOfConditionV;
	}

	

}
