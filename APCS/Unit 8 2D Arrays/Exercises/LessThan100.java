import java.util.Scanner;

public class LessThan100
{
	public static void main(String[]args)
	{

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter matrix size--> ");
	int rows = scan.nextInt();
	int cols = scan.nextInt();

	int[][]matrix = new int[rows][cols];



	for(int r = 0; r < matrix.length; r++)
	{
	   for(int c = 0; c < matrix[r].length; c++)
	   {
	      matrix[r][c] = (int)(Math.random() * 200) + 1;
	   }
	}
	System.out.println();
	System.out.println("Generated Matrix");
	System.out.println();

	for(int r = 0; r < matrix.length; r++)
	{
	   for(int c = 0; c < matrix[r].length; c++)
	   {
	      System.out.print(matrix[r][c] + " ");
	   }
	   System.out.println();
	}

	System.out.println();
	System.out.println("Numbers less than 100");
	System.out.println();
	System.out.println("Row     Column");

	for(int r = 0; r < matrix.length; r++)
	{
	   for(int c = 0; c < matrix[r].length; c++)
	   {
	      if(matrix[r][c] < 100)
	      {
	      	System.out.println(r + "        " + c);
	      }
	   }
	}
	System.out.println();


	}
}