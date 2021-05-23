import java.util.Scanner;

public class SumMatrix
{
	public static void main(String[]args)
	{

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter number of rows-->");
	int rows = scan.nextInt();
	System.out.print("Enter number of columns-->");
	int cols = scan.nextInt();
	System.out.println();

	int[][]matrix = new int[rows][cols];

	for(int r = 0; r < matrix.length; r++)
	{
	   for(int c = 0; c < matrix[r].length; c++)
	   {
	      matrix[r][c] = (int)(Math.random() * 9);
	   }
	}

	int sum = 0;

	for(int r = 0; r < matrix.length; r++)
	{
	   for(int c = 0; c < matrix[r].length; c++)
	   {
	      System.out.print(matrix[r][c] + " ");
	      sum += matrix[r][c];
	   }
	   System.out.println("   " + sum);
	}
	System.out.println();

	for(int c = 0; c < matrix[0].length; c++)
	{
	   int sum2 = 0;
	   for(int r = 0; r < matrix.length; r++)
	   {
	   	  sum2 += matrix[r][c];
	   }
	   System.out.print(sum2 + " ");
	}

	System.out.println();

}


}