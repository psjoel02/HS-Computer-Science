//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class BoxRunner
{
   public static void main( String args[] )
   {


   	Scanner scan = new Scanner(System.in);

   	System.out.println("What size would you like your box to be?");
   	int input = scan.nextInt();


   	Box bo = new Box(input);

   	for (int x = 1; x <= bo.getSize(); x++)
   	{
   		for (int y = bo.getSize(); y >= x; y--)
	   		{
	   			System.out.print("*");
	   		}

   		for (int z = 1; z <= x; z++)
	   		{
	   			System.out.print("#");
	   		}
   		System.out.println("");

   	}


	}
}