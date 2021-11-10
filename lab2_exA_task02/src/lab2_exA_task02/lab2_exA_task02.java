package lab2_exA_task02;

import java.util.ArrayList;

public class lab2_exA_task02 {

	public static void main(String[] args) {
		// Initialise ArrayList and append objects
		ArrayList<String> aArrayS = new ArrayList<String>();
		aArrayS.add("orange");
		aArrayS.add("banana");
		aArrayS.add("coconut");
		
		// For loop to print each item to console
		for(String aString : aArrayS) {
			System.out.println(aString);
		}

	}

}
