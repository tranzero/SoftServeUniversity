package firstTask;

import java.io.ObjectInputStream.GetField;

public class NaturalNumber {

	/**
	 * @param args
	 */
	private long[] natural = {1, 2, 3, 10, 55, 96, 58, 54555, 555656, 4, 8, 9, 65, 98};
	private int countOfConditionB = 0;
	private int countOfConditionV = 0;
	
	public NaturalNumber() {
		countNaturalForCondition(getNatural());
	}
	public NaturalNumber(long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	public int getCountOfConditionB() {
		return countOfConditionB;
	}

	public void setCountOfConditionB(int countOfConditionB) {
		this.countOfConditionB = countOfConditionB;
	}

	public int getCountOfConditionV() {
		return countOfConditionV;
	}

	public void setCountOfConditionV(int countOfConditionV) {
		this.countOfConditionV = countOfConditionV;
	}

	public long[] getNatural() {
		return natural;
	}

	public  boolean conditionB (long n){
		if (n%3 == 0 && n%5 != 0)
			return true;
		else
			return false;
		
	}
		
	public  boolean conditionV (long n){
		
		if (Math.sqrt(n) % 2 == 0)
			return true;
		else
			return false;
		
		
	}
	
	
	public  void countNaturalForCondition (long[] naturalArray){
		
		
		for (long naturalnubmer : naturalArray){
			
			if (conditionB(naturalnubmer))
				this.setCountOfConditionB(this.getCountOfConditionB()+1);			
			if (conditionV(naturalnubmer))
				this.setCountOfConditionV(this.getCountOfConditionV()+1);
			
		}
		System.out.println("ʳ������ �����, �� ����� 3 �� �� ����� 5 ���� "  +"\"" 
				+this.getCountOfConditionB()+"\"" );
		System.out.println("ʳ������ �����, ���������� ���� � ���� ����� ���� "+"\"" 
				+this.getCountOfConditionV()+"\"");
		
	}
	public static void main(String[] args) {
		
		
	
	
	
	
		
	}

	

}
