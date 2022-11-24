/**
 * Leap Year
    a. I/P -> Year, ensure it is a 4 digit number.
    b. Logic -> Determine if it is a Leap Year.
    c. O/P -> Print the year is a Leap Year or not.
 */
package com.java.corefunctions;

//it imports all the class of the java.util package
import java.util.*;

//class definition
public class LeapYear 
{
   // program execution starts from main method
	public static void main(String[] args) 
	{
		//Taking user input using Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		//logic for checking whether given year is leap year or not
		if ((year % 400==0) && (year % 4==0)) 
		{
			System.out.println(year+" is leap year");
		}
		else if (year % 100==0)
		{
			System.out.println(year+" is not a leap year");
		}
		else 
		{
			System.out.println(year+" is not a leap year");
		}
	}

}
