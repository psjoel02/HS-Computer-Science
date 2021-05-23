//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
		mat = new int[0][0];
	}

	public PascalsTriangle(int size)
	{
		mat = new int[size][size];
	}

	public void createTriangle()
	{
		int num = 1;
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat.length; j++)
			{
				mat[i][0] = 1;
				if(i > 0)
				{
					mat[i][j] += mat[i-1][j];
					if(j > 0)
					{
						mat[i][j] += mat[i-1][j-1];
					}
				}
			}
		}
	}

	public String toString()
	{
		String output="";

		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat.length; j++)
			{
				if(mat[i][j] != 0)
				{
					output += mat[i][j] + "\t";
				}
			}
			output += "\n";
		}

		return output;
	}
}