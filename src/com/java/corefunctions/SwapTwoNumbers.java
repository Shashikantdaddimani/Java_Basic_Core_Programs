/**
 * Java Program to Swap Two Numbers
 */
package com.java.corefunctions;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//Main class
public class SwapTwoNumbers 
{
	// program execution starts from main method
	public static void main(String[] args) 
	{ 	
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two number");
		
	 // Declaring and initializing integer variable
		int number1= input.nextInt();
		int number2 = input.nextInt();
		int swap;
		System.out.println("Before swapping "+number1+"&"+number2);
		swap = number1;
		number1=number2;
		number2=swap;
		System.out.println("After swapping "+number1+"&"+number2);
	}

}
