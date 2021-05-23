//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int total = 0;
		int first = ray.get(0);
		for(int i = 0; i < ray.size(); i++)
		{
			if(first < ray.get(i))
			{
				total += ray.get(i);
			}
		}
		if(total == 0)
			return -1;
		return total;
	}
}