/**
 * Java Program to Compute Quotient and Remainder
 */
package com.java.corefunctions;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//Main class
public class QuotientAndRemainder 
{
	// program execution starts from main method
	public static void main(String[] args) 
	{  
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number");
		
		// Declaring and initializing integer variable
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		
		//logic for checking Quotient and Remainder
		System.out.println("Quotient: "+number1/number2);
		System.out.println("Remainder: "+number1%number2);

	}

}
