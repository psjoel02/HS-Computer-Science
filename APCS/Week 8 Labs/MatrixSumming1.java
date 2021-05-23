import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum(  )
    {
		//add code here
		int total = 0;
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[i].length; j++)
			{
				System.out.print(m[i][j] + " ");
				total+=m[i][j];
			}
			System.out.println();
		}
		return total;
    }
}
