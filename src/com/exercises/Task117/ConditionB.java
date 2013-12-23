package com.exercises.Task117;

/**
 * 
 * @author tranzero
 *
 *���� �������� �����������, ������� ����� <code>�</code> ������ 
 *<code>�117</code>
 */
public class ConditionB extends ATask117 {
	
	/**
	 * nonArgument �����������.
	 * ������� nonArgument ����������� ������������ �����.
	 */
	public ConditionB() {
		super();
	}
	
	/**
	 * <p>����������� ������� ����������� � ��� � ����������.</p>
	 * 
	 * @param naturalNumber - ����� ������� ���� ����������� ����� ���� long.
	 */
	public ConditionB(final long... naturalNumber) {
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
	public final  boolean condition(final long n) {
		final long three = 3;
		final long five = 5;
		if ((n % three == 0) && (n % five != 0)) {
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
		System.out.println("ʳ������ �����, �� ����� 3 �� �� ����� 5 ���� "
							+ "\"" + super.getCountOfCondition() + "\"");
				
	}

}
