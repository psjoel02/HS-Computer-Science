import java.util.Scanner;

public class Transpose
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
	      matrix[r][c] = (int)(Math.random() * 200) - 100;
	   }
	}
	
	System.out.println();
	System.out.println("Original Matrix");
	
	for(int r = 0; r < matrix.length; r++)    
	{ 
	   for(int c = 0; c < matrix[r].length; c++)    
	   {
	      System.out.print(matrix[r][c] + " ");
	   }
	   System.out.println();
	}
	System.out.println();
	System.out.println("Transpose");
	
	int[][]matrix2 = new int[cols][rows];
	
	for (int r = 0; r < rows; r++) 
	{
	    for (int c = 0; c < cols; c++) 
	    {
	      matrix2[c][r] = matrix[r][c];
	    }
  	}
  	
	for(int r = 0 ; r < matrix2.length ; r++)
        {
            for(int c = 0 ; c <matrix2[r].length ; c++)
            {
                System.out.print(matrix2[r][c] + " ");
            }

            System.out.println();
        }
	System.out.println();
	}
}