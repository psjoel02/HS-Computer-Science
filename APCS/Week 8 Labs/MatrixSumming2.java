//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}}; //load in the matrix values
    public int sum( int r, int c )
    {
    	int total = 0;
    	for (int i = 0; i < m.length; i++)
    	{
    		for (int j = 0; j < m[i].length; j++)
    		{
    			if ((i >= (r - 1) && i <= (r + 1)) && (j >= (c - 1) && j <= (c + 1)))
    				total += m[i][j];
    		}
    	}
    	return total;
    }

    public String toString()
   	{
   		String result = "";
   		for (int[] y : m)
   		{
   			for (int x : y)
   			{
   				result += x + "  ";
   			}
   			result += "\n";
   		}
   		return result;
   	}
}
