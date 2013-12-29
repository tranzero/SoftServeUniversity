package com.exercises.Task178;

/**
 * 
 * @author tranzero
 *
 *���� �������� �����������, ������� ����� <code>�</code> ������ 
 *<code>�117</code>
 */
public class ConditionV extends ATask117 {

	/**
	 * nonArgument �����������.
	 * ������� nonArgument ����������� ������������ �����.
	 */
	public ConditionV() {
		super();
	}

	/**
	 * <p>����������� ������� ����������� � ��� � ����������.</p>
	 * 
	 * @param naturalNumber - ����� ������� ���� ����������� ����� ���� long.
	 */
	public ConditionV(final long... naturalNumber) {
		super(naturalNumber);
	}

	/**
	 * <p>����� �������� �����������</p>
	 * <p>����� ��������� �������� ����� 178 �).</p>
	 * 
	 * @param n - ������ ���������� ����� ���� long.
	 * @return <code>true</code> - ���� ����� ���������� ����� 178 �);
	 *		   <code>false</code> - ���� ����� �� ���������� ����� 178 �).
	 */
	@Override
	public final boolean condition(final long n) {
		
		if (Math.sqrt(n) % 2 == 0) {
			return true;
		}
	    	return false;
	}

	/**
	 * <p>�������� �����������. ��������� ������ ��� ��������
	 * 		�� ����� ��� �����.</p>
	 * 
	 * @param naturalArray - ����� ������� ���� ����������� ����� ���� long.
	 * 
	 */
	@Override
	public final void countNaturalForCondition(final long... naturalArray) {
			
		for (long naturalnumber : naturalArray) {
			
			if (this.condition(naturalnumber)) {
				super.setCountOfCondition(super.getCountOfCondition() + 1);
			}
						
		}
		System.out.println("ʳ������ �����, ���������� ���� � ���� ����� "
				+ "���� "
				+ "\"" + super.getCountOfCondition() + "\"");
				
	}
	
}
