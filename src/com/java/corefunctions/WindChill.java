
package com.java.corefunctions;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//Main class
public class WindChill 
{

	public static void main(String[] args) 
	{
		// program execution starts from main method
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Farhanite: ");
		
		// Declaring and initializing integer variable
		//t=temperature
		double t = input.nextDouble();								
		System.out.println("Enter Wind Speed in miles/hour: ");
		//v=Wind speed
		double v = input.nextDouble();								
		if(Math.abs(t)>50 || v < 120 || v > 3)
		{
			double w = 35.74 + 0.62158 * t + (0.4275  * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind Chill: "+ w);
		}

	}

}
