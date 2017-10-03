package basics1;

import java.util.Scanner;

public class DaysOfWeek {

		// write a program that scans a number from the user (use scanner)
		//and prints the corresponding days of the week
		//example if user entered 1 print Monday
		//if user entered 2 print Tuesday
		//Default condition invalid day of the week
		//Note: solve this using switch case
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		int number = new Scanner(System.in).nextInt();
		
		switch(number) {
		
		case 1:
	    System.out.println("monday");
	    break;
		case 2:
	    System.out.println("tuesday");
	    break;
		case 3:
	    System.out.println("wednesday");
	    break;
		case 4: 
		System.out.println("thursday");
		break;
		case 5:
		System.out.println("friday");
		break;
		case 6:
		System.out.println("saturday");
		break;
		case 7:
		System.out.println("sunday");
		break;
		
			
		
		}
		
	}
}


