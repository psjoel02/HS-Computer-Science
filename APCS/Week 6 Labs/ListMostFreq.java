//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( List<Integer> ray )
	{
		int largest = 0;
		int total = 0;

		for (int num1 : ray) 
		{
			int current = 0;
			
			for (int num2 : ray) 
			{
				if (num2 == num1) 
				{
					current++;
				}
			}
			
			if (current > total) 
			{
				largest = num1;
				total = current;
			}
		}

		return largest;
	}
}