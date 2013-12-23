package com.exercises.launcher;

import com.exercises.Task117.ATask117;
import com.exercises.Task117.ConditionB;
import com.exercises.Task117.ConditionV;
import com.exercises.Task117SingleClass.NaturalNumber;
import com.exercises.Task554.PifagorTrio;


/**
 * 
 * @author tranzero
 *
 * Класс Ланчер.
 */
public final class LauncherFromFirstTask {
	
	/**
	 * nonArgument конструктор.
	 */
	private LauncherFromFirstTask() {
	
	}

	/**
	 * main method.
	 * @param args - Console input args
	 */
	public static void main(final String[] args) {
		final ATask117 result =  new ConditionB(1, 3, 9, 16, 15, 45, 64,
														81, 121, 133, 123, 144);
		final ATask117 result2 =  new ConditionV(1, 3, 4, 16, 64, 81, 92, 144);
		
		System.out.println("-------------------------------------------------");
		
		final NaturalNumber result3 = new NaturalNumber();
		System.out.println("-------------------------------------------------");
		
		final PifagorTrio pifag = new PifagorTrio(150);
		

	}

}
