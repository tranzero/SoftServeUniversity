/**
 * 
 */
package com.exercises.Task117;

/**
 * @author tranzero
 *
 */
public abstract class ATask117 {

	/**
	 * <p>������� ������� ����� ����������� ����� (��� nonArgument 
	 * ������������).</p>
	 * 
	 */
	private final long[] natural = {1, 2, 3, 4, 55, 16, 78, 64, 555334, 6704};
	
	/**
	 * <p>������� �������� ��������.</p>
	 * 
	 */
	private int countOfCondition = 0;
	
		
	/**
	 * nonArgument �����������.
	 */
	public ATask117() {
		countNaturalForCondition(getNatural());
	}
	
	/**
	 * <p>�����������, � ����� �������� ����� �����.</p>
	 * 
	 * @param naturalNumber - ����� ������� ���� ����������� ����� ���� long.
	 */
	public ATask117(final long... naturalNumber) {
		countNaturalForCondition(naturalNumber);
	}
	
	
	
	
	/**
	 * ����� ������ ��� ������  natural.
	 * @return <code>natural</code> - �������� ������.
	 */
	public final long[] getNatural() {
		return natural;
	}
	
	/**
	 * ����� ������ ��� countOfCondition.
	 * @return <code>countOfCondition</code> - �������� ���������
	 */
	public final int getCountOfCondition() {
		return countOfCondition;
	}

	/**
	 * ����� ������ ��� countOfCondition.
	 * 
	 * @param counter - ���������� �������� ���������
	 */
	public final void setCountOfCondition(final int counter) {
		this.countOfCondition = counter;
	}

	/**
	 * <p>����������� �����, ���� ������� ������������� ������ ��� ��������
	 * 		�� ������� ��� �����.</p>
	 * 
	 * @param naturalArray - ����� ������� ���� ����������� ����� ���� long.
	 * 
	 */
	public abstract void countNaturalForCondition(long... naturalArray);
	
	/**
	 * <p>����������� �����, ���� ������� ��������� ����� ������� � ������.</p>
	 * 
	 @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� �����;
	 *		   <code>false</code> - ���� ����� �� ���������� �����.
	 */
	public abstract boolean condition(final long n);


}
