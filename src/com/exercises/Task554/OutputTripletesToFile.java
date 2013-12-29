package com.exercises.Task554;
/**
 * 
 * @author tranzero
 *
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Класс для запис у файл триплетів.
 */
public class OutputTripletesToFile {

	/**
	 * Конструктор з вхідним параметром.
	 * @param tripletes - об'єкт типу {@link PifagorTrio}
	 */
	public OutputTripletesToFile(final TrioFinder tripletes) {
		writeToFile(tripletes);
	}
	
	/**
	 * Метод записує триплети в файл.
	 * @param tripletes - об'єкт типу PifagorTrio
	 */
	public final void writeToFile(final TrioFinder tripletes) { 
		
		if (tripletes.getFirstTriplet().size() 
				== tripletes.getSecondTriplet().size() 
			&& tripletes.getSecondTriplet().size() 
			== tripletes.getThirdTriplet().size()) {
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("file-with-pifagortripletes.txt", "UTF-8");
			writer.println("Number   a     b     c     ");
			for (int i = 0; i < tripletes.getFirstTriplet().size(); i++) {
				writer.print("  " + i + ")     ");
				writer.print(tripletes.getFirstTriplet().get(i) + "     ");
				writer.print(tripletes.getSecondTriplet().get(i) + "     ");
				writer.println(tripletes.getThirdTriplet().get(i) + "    ");
			}
			System.out.println();
			System.out.println("Copleted!");
			System.out.println("Your triplets was recorded to file.");
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found...");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.out.println("Wrong encoding format!");
			} finally {
			
				if (writer != null) {
				writer.close();
				
				}
		}
	
	
		}
	}
}