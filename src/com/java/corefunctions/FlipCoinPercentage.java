/**
 * Flip Coin and print percentage of Heads and Tails
    a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
    b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
    c. O/P -> Percentage of Head vs Tails
 */
package com.java.corefunctions;

//it imports all the class of the java.utill package
import java.util.*;

//class definition
public class FlipCoinPercentage 
{

	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		//Random object class by getting random number
		Random random = new Random();
		System.out.println("Enter Number of times want coin to flip: ");
		int totalFlips = input.nextInt();
		int headFlip=0;
		int tailFlip=0;
		
		//logic for finding head and tail 
		if (totalFlips>0)
		{
			for(int i=1;i<=totalFlips;i++)
			{
				int flipValue = random.nextInt(2);	//random number are 0 or 1
				
				if(flipValue>0.5)
					headFlip++;
				else
					tailFlip++;
					
			}
		}
		else
		{
			System.out.println("Negative value not allowed. entered positive value  ");
		}
		//logic to finding for  percentage of flipcoin
		float headPercent = (headFlip * 100)/totalFlips;
		float tailPercent = (tailFlip * 100)/totalFlips;
		System.out.println("HeadPercentage: "+headPercent);
		System.out.println("TailPercentage: "+tailPercent);
		
		
	}

}
