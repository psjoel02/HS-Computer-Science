//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		int counter = 0;
		int size = numArray.size()-1;
		
		for (int i = 0; i< numArray.size()-1 ; i++)
		{
			if ((numArray.get(i) > numArray.get(i+1)) && (i != numArray.size()-1))
			{
				counter += 1;
			}
		}
		if (counter == size)
		{
		return true;
		}
		
		return false;
	}	
}