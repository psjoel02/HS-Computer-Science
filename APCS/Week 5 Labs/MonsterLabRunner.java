//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		System.out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();  
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			
			// read in monster values
			// ask for ht
			System.out.print("\n Enter the ht :: ");
			int ht = keyboard.nextInt();

			// ask for wt
			System.out.print("\n Enter the wt :: ");
			int wt = keyboard.nextInt();

			// ask for age
			System.out.print("\n Enter the age :: ");
			int age = keyboard.nextInt();

			// instantiate a new Monster() and add it to the herd
			herd.add(i, new Monster(ht, wt, age));
			System.out.println("\n");			
			
			
		}		
		
		System.out.println("HERD :: "+herd);
		System.out.println();
		System.out.println("SMALLEST :: " + herd.getSmallest());
		System.out.println("LARGEST :: " + herd.getLargest());
		//print out the other stats
			
	}		
}