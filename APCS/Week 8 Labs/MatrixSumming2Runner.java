//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
		
		int n = file.nextInt();
		
		MatrixSumming2 m = new MatrixSumming2();
		System.out.println("Matrix values");
		System.out.println(m);
		
		for (int i = 0; i < n; i++)
		{
			int r = file.nextInt();
			int c = file.nextInt();
			System.out.println("The sum of " + r + ", " + c + " is " + m.sum(r, c) + ".");
		}
	}
}



