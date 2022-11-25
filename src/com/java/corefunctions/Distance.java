package com.java.corefunctions;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;
//main class
public class Distance 
{
	/**
	 * program execution starts from main method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/**
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		
		//Declaring and initializing integer variable
		//x and y are points
		int x = input.nextInt();
		System.out.println("Enter value of y: ");
		int y = input.nextInt();
		calculate(x,y);
		
	}

	private static void calculate(int x, int y) {
		/**
		 * Function to calculate the value of distance
		 * 
		 * @param x value of x axis
		 * @param y value of y axis
		 */
		double distance = Math.pow((x * x + y * y), 0.5);
		System.out.println("Distance :"+distance);
		
	}

}
