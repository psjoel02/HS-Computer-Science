//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
		int last = ray.get(ray.size()-1);
		int counter = 0;
		for(int i = 0; i < ray.size(); i++)
		{
			if(last == ray.get(i))
			{
				counter++;
			}
		}
		if(counter >= 2)
			return true;
			
		return false;
			
	}
}