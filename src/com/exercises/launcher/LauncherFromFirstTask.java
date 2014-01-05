package com.exercises.launcher;


import com.exercises.Task178.ConditionB;
import com.exercises.Task178.ConditionV;
import com.exercises.Task178.PreCondition;
import com.exercises.Task178SingleClass.NaturalNumber;
import com.exercises.Task554.OutputTripletesToFile;
import com.exercises.Task554.PifagorTrio;
import com.exercises.Task554.TrioFinder;



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
		final PreCondition result =  new ConditionB(1, 3, 9, 16, 15, 45, 64,
														81, 121, 133, 123, 144);
		final PreCondition result2 =  new ConditionV(1, 3, 4, 16, 64, 81, 144);
		
		System.out.println("-------------------------------------------------");
		
		final NaturalNumber result3 = new NaturalNumber();
		System.out.println("-------------------------------------------------");
		
		final TrioFinder pifag = new PifagorTrio(196, "off");
		
		final OutputTripletesToFile out = new OutputTripletesToFile(pifag);
		
		
		

	}

}
