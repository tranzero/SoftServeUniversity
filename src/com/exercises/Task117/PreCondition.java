/**
 * 
 */
package com.exercises.Task117;

/**
 * @author tranzero
 *
 */
public interface PreCondition {
	
	/**
	 * <p>��������� ������ ��� ��������
	 * 		�� ����� ��� �����.</p>
	 * 
	 * @param naturalArray - ����� ������� ���� ����������� ����� ���� long.
	 * 
	 */
	void countNaturalForCondition(long... naturalArray);
	
	/**
	 * 
	 * <p>����� ��������� �������� ����� 178 �).</p>
	 * 
	 * @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� ����� 178 �);
	 *		   <code>false</code> - ���� ����� �� ���������� ����� 178 �).
	 */
	boolean condition(final long n);

}
