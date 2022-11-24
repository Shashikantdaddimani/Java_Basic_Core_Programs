package com.java.corefunctions;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class CheckEvenOrOdd 
{
	// program execution starts from main method
	public static void main(String[] args) 
	{
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = input.nextInt();
		EvenOdd(number);
	}
	//logic for checking a given number is even or odd
	
	static void EvenOdd(int number)
	{
		if( number % 2 == 0)
			System.out.println("Even Number: "+number);
		else
			System.out.println("Odd Number: "+number);
	}

}
