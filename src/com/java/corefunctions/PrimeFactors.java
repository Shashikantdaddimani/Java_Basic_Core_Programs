package com.java.corefunctions;

// imports all the class of the java.util package
import java.util.*;

//class definition
public class PrimeFactors 
{

	// program execution starts from main method
	public static void main(String[] args) 
	{
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		System.out.println("Prime factors for the given numbers are :" );
		
		// logic for checking  PrimeFactor
		for(int i=2;i<=number;i++){
		
			while(number%i==0)
			{
				System.out.println(i+"");
				number=number/i;
			}
		}
	}

}
