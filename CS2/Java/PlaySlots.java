
import java.util.Scanner;
public class PlaySlots
{
public static void main (String[]args)
{


	Scanner scan = new Scanner(System.in);
	SlotMachine slotmachine = new SlotMachine();


	System.out.println("1. Pull Lever 2. Quit -->");
	int choice = scan.nextInt();
	System.out.println();
	int i = 0;
	while(choice == 1)
	{
		if(i >= 1)
		{
		System.out.println("1. Pull Lever 2. Quit -->");
		choice = scan.nextInt();
		}
		slotmachine.pullLever();
		slotmachine.displayRollers();
		slotmachine.displayResults();
		i++;
		while(slotmachine.cash <= 0)
		{
			System.out.println("Go home you are broke!");
			System.out.println("1. Pull Lever 2. Quit -->");
			choice = scan.nextInt();
			System.out.println();
		}




}

}


}























