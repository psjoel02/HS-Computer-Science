//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		int smallest = Integer.MAX_VALUE;
		int biggest = Integer.MIN_VALUE;
		
		for(int i = 0; i < ray.size(); i++) 
		{
			if(ray.get(i) > biggest) 
			{
				biggest = ray.get(i);
			}
			
			if(ray.get(i) < smallest) 
			{
				smallest = ray.get(i);
			}
		}
		
		return (double)(biggest+smallest)/2;
	}
}