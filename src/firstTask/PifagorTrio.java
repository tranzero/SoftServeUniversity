package firstTask;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tranzero
 * 
 */

/**
 * <p>Клас вирішує задачу 554</p>
 * 
 */ 
public class PifagorTrio {
	
	/**
	 * <p>Колекції в яких зберігаються триплети <code>a, b, c</code> </p>
	 * 
	 */ 
	public List <Integer> a = new ArrayList<>();
	public List <Integer> b = new ArrayList<>();
	public List <Integer> c = new ArrayList<>();
	public int count = -1;
	
	/**
	 * <p>Конструктор, в якому вкладена точка входу</p>
	 * 
	 * @param n - значення числа <code>n</code> відповідно до умови.
	 */
	public PifagorTrio (int n){
		printPifagorTrio(n);
	}
	
	/**
	 * <p>Метод забезпечує пошук усіх можливих триплетів та 
	 * 		заповнює колекції триплетів.</p>
	 * 
	 * @param n - значення числа <code>n</code> відповідно до умови.
	 * 
	 */
	public void findPifagorTrio (int n){
		
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n; j++){
				for (int z = 1; z <= n; z++){
					if ((((int)Math.pow(i, 2) + (int)Math.pow(j, 2)) 
							== (int)Math.pow(z, 2)) && i <= j && j <=z ){
						a.add(i);
						b.add(j);
						c.add(z);
						count++;
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
	public void printPifagorTrio (int n){
		findPifagorTrio(n);
		System.out.println("№        a          b           c     ");
		for (int i=0; i <= count; i++){
			System.out.print(i+1 + ")     ");
			System.out.print(a.get(i) + "     ");
			System.out.print(b.get(i) + "     ");
			System.out.println(c.get(i) + "     ");
			
		}
	}
	
}
