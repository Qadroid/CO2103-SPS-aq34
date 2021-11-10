package lab2_exA_task01;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class lab2_exA_task01 {

	public static void main(String[] args) {
		StringBuilder aString = new StringBuilder(); 
		aString.append("Artemis"); // Just the name here so if the name needs changing it's easy.
		aString.append(": "); // Just the part after the name.
		GregorianCalendar aCal = new GregorianCalendar(2021, GregorianCalendar.OCTOBER, 8); // Set the date
		SimpleDateFormat aFormat = new SimpleDateFormat("dd-MM-yyyy"); // The correct format for the date
		aString.append(aFormat.format(aCal.getTime()));
		System.out.println(aString);
	}

}
