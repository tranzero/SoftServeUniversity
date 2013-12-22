package firstTask;

/**
 * @author tranzero
 * 
 */

/**
 * <p>���� ����� ������ 178 �) �) </p>
 * 
 */
public class NaturalNumber {

	
	/**
	 * <p>������� ������� ����� ����������� ����� (��� nonArgument 
	 * ������������)</p>
	 * 
	 */
	private long[] natural = {1, 2, 3, 10, 55, 96, 58, 54555, 555656,
							  4, 8, 9, 65, 98};
	
	/**
	 * <p>������� �������� �������� �� ������� 178 �)</p>
	 * 
	 */
	private int countOfConditionB = 0;
	
	/**
	 * <p>������� �������� �������� �� ������� 178 �)</p>
	 * 
	 */
	private int countOfConditionV = 0;
	
	public NaturalNumber() {
		countNaturalForCondition(getNatural());
	}
	
	/**
	 * <p>�����������, � ����� �������� ����� �����</p>
	 * 
	 * @param naturalNumber - ����� ������� ���� ����������� ����� ���� long.
	 */
	public NaturalNumber(long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	/**
	 * <p>����� ��������� �������� ����� 178 �)</p>
	 * 
	 * @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� ����� 178 �);
	 *		   <code>false</code> - ���� ����� �� ���������� ����� 178 �).
	 */
	public  boolean conditionB (long n){
		if (n%3 == 0 && n%5 != 0)
			return true;
		else
			return false;
		
	}

	/**
	 * <p>����� ��������� �������� ����� 178 �)</p>
	 * 
	 * @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� ����� 178 �);
	 *		   <code>false</code> - ���� ����� �� ���������� ����� 178 �).
	 */
	public  boolean conditionV (long n){
		
		if (Math.sqrt(n) % 2 == 0)
			return true;
		else
			return false;
		
		
	}
	
	/**
	 * <p>����� ��������� ������ ��� ��������
	 * 		�� ����� ��� �����</p>
	 * 
	 * @param naturalArray - ����� ������� ���� ����������� ����� ���� long.
	 * 
	 */
	public  void countNaturalForCondition (long... naturalArray){
		
		
		for (long naturalnumber : naturalArray){
			
			if (conditionB(naturalnumber))
				this.setCountOfConditionB(this.getCountOfConditionB()+1);			
			if (conditionV(naturalnumber))
				this.setCountOfConditionV(this.getCountOfConditionV()+1);
			
		}
		System.out.println("ʳ������ �����, �� ����� 3 �� �� ����� 5 ���� "
							+"\""+this.getCountOfConditionB()+"\"" );
		System.out.println("ʳ������ �����, ���������� ���� � ���� ����� ���� "
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
