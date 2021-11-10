package lab2_exA_task04;

import java.util.ArrayList;

public class lab2_exA_task04 {

	public static void main(String[] args) {
		// Initialise ArrayList and append objects
		ArrayList<String> aArrayS = new ArrayList<String>();
		aArrayS.add("orange");
		aArrayS.add("banana");
		aArrayS.add("coconut");
		
		// Check for item
		if (aArrayS.contains("banana")) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}
