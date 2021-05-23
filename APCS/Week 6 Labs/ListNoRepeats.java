//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		for (int num : ray)
		{
			if (!numbers.contains(num))
			{
				numbers.add(num);
			}
		}
		
		return numbers.size() == ray.size();
		
	}
}