//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix

	private int[][] array;
	
	public SpiralMatrix()
	{
		array = null;
	}

	public SpiralMatrix(int size)
	{
		array = new int[size][size];
	}
	
	public void setSize(int size)
	{
		array = null;
		array = new int[size][size];
	}

	public void createSpiral()
	{
		int rowsdone = 0;
		int colsdone = 0;
		int counter = 0;
		
		do
		{
			for (int i = rowsdone; i < array.length - rowsdone; i++)
			{
				array[i][colsdone] = counter;
				counter++;
			}
			
			for (int j = colsdone; j < array.length - colsdone; j++)
			{
				array[array.length - 1 - colsdone][j] = counter;
				counter++;
			}
			
			for (int k = array.length - 1 - colsdone; k > colsdone; k++)
			{
				array[k][array.length - 1 - rowsdone] = counter;
				counter++;
			}
			colsdone++;
			for (int l = array.length - 1 - )
		}
	}

	public String toString( )
	{
		String output="";
		return output;
	}
}