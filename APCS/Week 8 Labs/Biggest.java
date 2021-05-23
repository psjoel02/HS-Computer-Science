//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
    	int largest = m[0][0];
		for (int[] y : m)
		{
			for (int x : y)
			{
				if (x > largest)
					largest = x;
			}
		}
		return largest;
    }
}
