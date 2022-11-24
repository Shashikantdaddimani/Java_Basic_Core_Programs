package com.java.corefunctions;

// imports all the class of the java.util package
import java.util.*;

//class definition
public class HarmonicNumber 
{
	// program execution starts from main method
	public static void main(String[] args)
	{
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number to find its Harmonic value:");
		int number = input.nextInt();
		double harmonic = 0;
		//logic for checking Harmonic number
		for (double i = 1; i < number; i++) {
			harmonic = harmonic + (1 / i);
		}
		System.out.println("Harmonic value: " + harmonic);

	}

}
