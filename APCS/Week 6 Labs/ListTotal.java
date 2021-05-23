//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int total = 0;
		
		for(int num : ray)
		{
			total += num;
		}
		
		return total;
	}
}