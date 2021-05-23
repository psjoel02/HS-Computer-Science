//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> values = new ArrayList<Integer>();
    	for (int[] y : m)
    	{
    		int sum = 0;
    		for (int x : y)
    		{
    			sum += x;
    		}
    		values.add(sum);
    	}
		return values;
    }
}
