/**
 * Java Program to Find the Largest Among Three Numbers
 */
package com.java.corefunctions;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//Main class
public class LargestAmongThree 
{

	// program execution starts from main method
	public static void main(String[] args) 
	{
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three Number");
		
		// Declaring and initializing integer variable
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		largestNumber(number1,number2,number3);
	
	}
		//Declare Static method
		static void largestNumber(int number1, int number2, int number3) 
		{
			//Logic for checking Largest number
		if ((number1>number2) && (number1>number3))
			System.out.println(number1+" :is Largest Number");
		else if ((number2>number3))
			System.out.println(number2+" :is Largest Number");
		else
			System.out.println(number3+" :Is Largest Number");
		
	}

}
