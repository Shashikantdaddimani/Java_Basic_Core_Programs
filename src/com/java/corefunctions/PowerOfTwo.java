/**
 * Power of 2
   a. Desc -> This program takes a command-line argument N and prints a table of the
      powers of 2 that are less than or equal to 2^N.
   b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
   c. Logic -> repeat until i equals N.
   d. O/P -> Print the year is a Leap Year or not.
 */
package com.java.corefunctions;

//it imports all the class of the java.util package
import java.util.Scanner;

//class definition
public class PowerOfTwo 
{
	// program execution starts from main method
	public static void main(String[] args) 
	{
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Power: ");
		int number = input.nextInt();
		if( number>=0 && number<=31)
		{
			/* (Math)inbuilt function to calculate power
			 * (int) type of data to be input
			 * */ 
			int power = (int) Math.pow(2, number);
			System.out.println("Power of 2 ^ "+number+" is "+power);
			
			for(int i=0; i<=number; i++)
			{
				int power2 =(int) Math.pow(2, i);
				System.out.println("Power of 2 ^ "+i+" is "+power2);	
			}
		}
		else
		{
			System.out.println("Enter Range less than 32 and try again");
		}
		

	}

}
