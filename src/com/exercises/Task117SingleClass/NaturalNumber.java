package com.exercises.Task117SingleClass;



/**
 * @author tranzero
 * 
 */

/**
 * <p>���� ����� ������ 178 �) �).</p>
 */
public class NaturalNumber {

	
	/**
	 * <p>������� ������� ����� ����������� ����� (��� nonArgument 
	 * ������������).</p>
	 * 
	 */
	private final long[] natural = {1, 2, 3, 4, 55, 16, 78, 64, 555334, 6704};
	
	/**
	 * <p>������� �������� �������� �� ������� 178 �).</p>
	 * 
	 */
	private int countOfConditionB = 0;
	
	/**
	 * <p>������� �������� �������� �� ������� 178 �).</p>
	 * 
	 */
	private int countOfConditionV = 0;
	
	/**
	 * nonArgument �����������.
	 */
	public NaturalNumber() {
		countNaturalForCondition(getNatural());
	}
	
	/**
	 * <p>�����������, � ����� �������� ����� �����.</p>
	 * 
	 * @param naturalNumber - ����� ������� ���� ����������� ����� ���� long.
	 */
	public NaturalNumber(final long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	/**
	 * <p>����� ��������� �������� ����� 178 �).</p>
	 * 
	 * @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� ����� 178 �);
	 *		   <code>false</code> - ���� ����� �� ���������� ����� 178 �).
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
	 * <p>����� ��������� �������� ����� 178 �).</p>
	 * 
	 * @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� ����� 178 �);
	 *		   <code>false</code> - ���� ����� �� ���������� ����� 178 �).
	 */
	public final boolean conditionV(final long n) {
		
		if (Math.sqrt(n) % 2 == 0) {
			return true;
		}
		
			return false;
		
		
		
	}
	
	/**
	 * <p>����� ��������� ������ ��� ��������
	 * 		�� ����� ��� �����.</p>
	 * 
	 * @param naturalArray - ����� ������� ���� ����������� ����� ���� long.
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
		System.out.println("ʳ������ �����, �� ����� 3 �� �� ����� 5 ���� "
							+ "\"" + this.getCountOfConditionB() + "\"");
		System.out.println("ʳ������ �����, ���������� ���� � ���� ����� "
							+ "���� "
							+ "\"" + this.getCountOfConditionV() + "\"");
		
	}

	/**
	 * ����� ������ ��� countOfConditionB.
	 * @return <code>countOfConditionB</code> - �������� ��������� ��� 
	 * ����� 178 �)
	 */
	public final int getCountOfConditionB() {
		return countOfConditionB;
	}

	/**
	 * ����� ������ ��� countOfConditionV.
	 * @return <code>countOfConditionVB</code> - �������� ��������� ��� 
	 * ����� 178 �)
	 */
	public final int getCountOfConditionV() {
		return countOfConditionV;
	}
	
	/**
	 * ����� ������ ��� ������  natural.
	 * @return <code>natural</code> - �������� ������.
	 */
	public final long[] getNatural() {
		return natural;
	}
	
	/**
	 * ����� ������ ��� countOfConditionB.
	 * 
	 * @param nextCount - ���������� �������� ���������
	 */
	public final void setCountOfConditionB(final int nextCount) {
		this.countOfConditionB = nextCount;
	}
	
	/**
	 * ����� ������ ��� countOfConditionV.
	 * 
	 * @param nextCount - ���������� �������� ���������
	 */
	public final void setCountOfConditionV(final int nextCount) {
		this.countOfConditionV = nextCount;
	}

	

}

