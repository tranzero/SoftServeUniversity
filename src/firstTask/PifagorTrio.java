package firstTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PifagorTrio {

	public List <Integer> a = new ArrayList<>();
	public List <Integer> b = new ArrayList<>();
	public List <Integer> c = new ArrayList<>();
	public int count = -1;
	public PifagorTrio (int n){
		printPifagorTrio(n);
	}
	
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
	
	public void printPifagorTrio (int n){
		findPifagorTrio(n);
		System.out.println("¹        a          b           c     ");
		for (int i=0; i <= count; i++){
			System.out.print(i+1 + ")     ");
			System.out.print(a.get(i) + "     ");
			System.out.print(b.get(i) + "     ");
			System.out.println(c.get(i) + "     ");
			
		}
	}
	
	public static void main(String[] args) {
		
		

	}

}
