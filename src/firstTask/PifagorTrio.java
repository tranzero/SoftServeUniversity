package firstTask;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tranzero
 * 
 */

/**
 * <p>���� ����� ������ 554</p>
 * 
 */ 
public class PifagorTrio {
	
	/**
	 * <p>�������� � ���� ����������� �������� <code>a, b, c</code> </p>
	 * 
	 */ 
	public List <Integer> a = new ArrayList<>();
	public List <Integer> b = new ArrayList<>();
	public List <Integer> c = new ArrayList<>();
	public int count = -1;
	
	/**
	 * <p>�����������, � ����� �������� ����� �����</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
	 */
	public PifagorTrio (int n){
		printPifagorTrio(n);
	}
	
	/**
	 * <p>����� ��������� ����� ��� �������� �������� �� 
	 * 		�������� �������� ��������.</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
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
	 * <p>����� ��������� ���� � ������� ��� �������� �������� �� 
	 * 		��'��� ��� �����.</p>
	 * 
	 * @param n - �������� ����� <code>n</code> �������� �� �����.
	 * 
	 */
	public void printPifagorTrio (int n){
		findPifagorTrio(n);
		System.out.println("�        a          b           c     ");
		for (int i=0; i <= count; i++){
			System.out.print(i+1 + ")     ");
			System.out.print(a.get(i) + "     ");
			System.out.print(b.get(i) + "     ");
			System.out.println(c.get(i) + "     ");
			
		}
	}
	
}
