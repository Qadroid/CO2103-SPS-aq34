package lab2_exA_task05;

import java.util.ArrayList;

public class lab2_exA_task05 {

	public static void main(String[] args) {
		// Initialise ArrayList and append objects
		ArrayList<String> aArrayS = new ArrayList<String>();
		aArrayS.add("orange");
		aArrayS.add("banana");
		aArrayS.add("coconut");
		
		for (String word:aArrayS) {
			if (word.contains("n")) {
				System.out.println("Found");
			} else {
				System.out.println("Fruit "+word+" does not contain the letter n");
			}
		}
	}

}
