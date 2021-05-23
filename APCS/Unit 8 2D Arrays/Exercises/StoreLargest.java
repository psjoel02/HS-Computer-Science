import java.util.Scanner;

public class StoreLargest
{
	public static void main(String[]args)
	{
	 	
	 int[][]matrix = new int[4][4];
	 int[][]matrix2 = new int[4][4];
	 int[][]matrix3 = new int[4][4];
	 
	 for(int r = 0; r < matrix.length; r++)      
	{ 
	   for(int c = 0; c < matrix[r].length; c++)    
	   {
	      matrix[r][c] = (int)(Math.random() * 9);
	   }
	}
	
	System.out.println("Matrix 1");
	for(int r[] : matrix)
	 {
	 	for(int c : r)
	 	{
	 		System.out.print(c + " ");
	 	}
	 	System.out.println();
	 }
	System.out.println();
	
	for(int r = 0; r < matrix2.length; r++)      
	{ 
	   for(int c = 0; c < matrix2[r].length; c++)    
	   {
	      matrix2[r][c] = (int)(Math.random() * 9);
	   }
	}
	
	System.out.println("Matrix 2"); 	
	for(int r[] : matrix2)
	 {
	 	for(int c : r)
	 	{
	 		System.out.print(c + " ");
	 	}
	 	System.out.println();
	 } 	
	 System.out.println();	
	 	
	 System.out.println("Largest Elements");	
	 for (int r = 0; r < matrix3.length; r++) 
	{
	    for (int c = 0; c < matrix3[r].length; c++) 
	    {
	      if(matrix[r][c] > matrix2[r][c])
	       matrix3[r][c] = matrix[r][c];
	       
	       if(matrix[r][c] < matrix2[r][c])
	       matrix3[r][c] = matrix2[r][c];
	    }
  	}	
	 	
	for(int r[] : matrix3)
	 {
	 	for(int c : r)
	 	{
	 		System.out.print(c + " ");
	 	}
	 	System.out.println();
	 } 	
	 System.out.println();
	  	
	}
}