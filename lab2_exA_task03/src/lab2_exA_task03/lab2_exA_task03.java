package lab2_exA_task03;

import java.util.ArrayList;

public class lab2_exA_task03 {

	public static void main(String[] args) {
		// Initialise the ArrayList and add items
		ArrayList<Integer> aArrayN = new ArrayList<Integer>();
		aArrayN.add(1);
		aArrayN.add(2);
		aArrayN.add(3);
		aArrayN.add(4);
		aArrayN.add(5);
		aArrayN.add(6);
		aArrayN.add(7);
		aArrayN.add(8);
		aArrayN.add(9);
		aArrayN.add(10);
		
		// Initialise a variable to count sum 
		float sum = 0;
		
		// For loop to print each item from ArrayList
		for(Integer i:aArrayN) {
			sum += i;
		}
		
		// Calculation to find the average of the items in list and print to console
		float sumAverage = sum / aArrayN.size();
		System.out.println(sumAverage);
	}

}
