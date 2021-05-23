import java.util.Scanner;

public class Reverse
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int[]ints = new int[20];

		System.out.println("Enter 20 integers. ");
		for(int i = 0; i < ints.length; i++)
		{
			System.out.print("Num" + (i + 1) + "-->");
			ints[i] = scan.nextInt();
		}

		for(int i : ints)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i = ints.length - 1; i >= 0; i--)
		{
			System.out.print(ints[i] + " ");
		}







	}
}