package com.exercises.firstTask;


/**
 * 
 * @author tranzero
 *
 * ����� ������.
 */
public final class Launcher {
	
	/**
	 * nonArgument �����������.
	 */
	private Launcher() {
	
	}

	/**
	 * main method.
	 * @param args - Console input args
	 */
	public static void main(final String[] args) {
		final NaturalNumber result =  new NaturalNumber(1, 3, 9, 16, 15, 45, 64,
														 81, 121, 133, 123);
		result.toString();	
		System.out.println();
		final PifagorTrio pifag = new PifagorTrio(150);
		pifag.toString();

	}

}
