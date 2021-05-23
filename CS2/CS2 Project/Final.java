import java.util.*;

public class Final
{

 	public static void main(String[] args)
    {

    FP fp = new FP();
	Scanner scan = new Scanner(System.in);
	int sel = 0;
	int cround = 0;
	System.out.println("Programmed by Joel Pimenta");

	System.out.println("----------------------");
    System.out.println("-   Lucky Dice War   -");
    System.out.println("----------------------");

	do
     {

		System.out.println();
		System.out.println("======================================================");
		System.out.println("1. Play Lucky Dice War");
		System.out.println("2. Set # of Rounds, " + "Current Amount: " + fp.getRounds());
		System.out.println("3. Set # of Sides on the Die, " + "Current Amount: " + fp.getSides());
		System.out.println("4. Set Bet Amount, " + "Current Amount: $" + fp.getBet());
		System.out.println("5. Set Starting Cash, " + "Current Amount: $" + fp.getCash());
		System.out.println("6. End Dice War 2.0");
		System.out.println("======================================================");
		sel = scan.nextInt();

		if(sel == 1)
		{
			System.out.println();

			while(cround < fp.getRounds())
			{

			System.out.println();
			System.out.println("Press 1 to roll your die");
			int roll = scan.nextInt();

			if(roll == 1)
			{

		if(fp.sides == 6)
		{
				fp.setRandom1();
				fp.setRandom2();
				System.out.println();
				System.out.println("You rolled a " + fp.getRandom1());
				System.out.println("CPU rolled a " + fp.getRandom2());

				if(fp.getRandom1() == 1)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("|       |");
					System.out.println("|   o   |");
					System.out.println("|       |");
					System.out.println("+-------+ ");
					System.out.println();
				}
				if(fp.getRandom2() == 1)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("|       |");
					System.out.println("|   o   |");
					System.out.println("|       |");
					System.out.println("+-------+ ");
					System.out.println();
				}

				if(fp.getRandom1() == 2)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o     |");
					System.out.println("|       |");
					System.out.println("|     o |");
					System.out.println("+-------+");
					System.out.println();
				}
				if(fp.getRandom2() == 2)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o     |");
					System.out.println("|       |");
					System.out.println("|     o |");
					System.out.println("+-------+");
					System.out.println();
				}

				if(fp.getRandom1() == 3)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o     |");
					System.out.println("|   o   |");
					System.out.println("|     o |");
					System.out.println("+-------+");
					System.out.println();
				}
				if(fp.getRandom2() == 3)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o     |");
					System.out.println("|   o   |");
					System.out.println("|     o |");
					System.out.println("+-------+");
					System.out.println();
				}

				if(fp.getRandom1() == 4)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o   o |");
					System.out.println("|       |");
					System.out.println("| o   o |");
					System.out.println("+-------+");
					System.out.println();
				}
				if(fp.getRandom2() == 4)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o   o |");
					System.out.println("|       |");
					System.out.println("| o   o |");
					System.out.println("+-------+");
					System.out.println();
				}

				if(fp.getRandom1() == 5)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o   o |");
					System.out.println("|   o   |");
					System.out.println("| o   o |");
					System.out.println("+-------+");
					System.out.println();
				}
				if(fp.getRandom2() == 5)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o   o |");
					System.out.println("|   o   |");
					System.out.println("| o   o |");
					System.out.println("+-------+");
					System.out.println();
				}

				if(fp.getRandom1() == 6)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o   o |");
					System.out.println("| o   o |");
					System.out.println("| o   o |");
					System.out.println("+-------+");
					System.out.println();
				}
				if(fp.getRandom2() == 6)
				{
					System.out.println();
					System.out.println("+-------+");
					System.out.println("| o   o |");
					System.out.println("| o   o |");
					System.out.println("| o   o |");
					System.out.println("+-------+");
					System.out.println();
				}



				if(fp.getRandom1() > fp.getRandom2())
				{
					System.out.println("You won the round.");
					fp.score1++;
					cround++;

							System.out.println("======================================================");
							System.out.println("Current Score: " + fp.getScore1());
							System.out.println("CPU Score: " + fp.getScore2());
							System.out.println("======================================================");
				}

				if(fp.getRandom2() > fp.getRandom1())
				{
					System.out.println("You lost the round.");
					fp.score2++;
					cround++;

						System.out.println("======================================================");
						System.out.println("Current Score: " + fp.getScore1());
						System.out.println("CPU Score: " + fp.getScore2());
						System.out.println("======================================================");
				}

				if(fp.getRandom1() == fp.getRandom2())
				{
					System.out.println("It was a tie!");
					cround++;

						System.out.println("======================================================");
						System.out.println("Current Score: " + fp.getScore1());
						System.out.println("CPU Score: " + fp.getScore2());
						System.out.println("======================================================");
				}



				if((cround == fp.getRounds()) && (fp.score1 > fp.score2) )
				{
					System.out.println();
					System.out.println("You Won the Game!");
					System.out.println("1. Play Again");
					System.out.println("2. Change Rounds");
					System.out.println("3. Change Sides");
					System.out.println("4. Change Bet");
					System.out.println("6. End Game");
					sel = scan.nextInt();
					if(sel == 1)
					{
						fp.score1 = 0;
						fp.score2 = 0;
						cround = 0;
					}

				}

				if((cround == fp.getRounds()) && (fp.score1 < fp.score2))
				{
					System.out.println();
					System.out.println("You Lost the Game.");
					System.out.println("1. Play Again");
					System.out.println("2. Change Rounds");
					System.out.println("3. Change Sides");
					System.out.println("4. Change Bet");
					System.out.println("6. End Game");
					sel = scan.nextInt();
					if(sel == 1)
					{
						fp.score1 = 0;
						fp.score2 = 0;
						cround = 0;
					}

				}

				if((cround == fp.getRounds()) && (fp.score1 == fp.score2))
				{
					System.out.println();
					System.out.println("You Tied.");
					System.out.println("1. Play Again");
					System.out.println("2. Set Rounds");
					System.out.println("3. Set Sides");
					System.out.println("4. Set Bet");
					System.out.println("6. End Game");
					sel = scan.nextInt();
					if(sel == 1)
					{
						fp.score1 = 0;
						fp.score2 = 0;
						cround = 0;
					}

				}
		}

		if(fp.sides == 10)
		{

				fp.setRandom3();
				fp.setRandom4();
				System.out.println();
				System.out.println("You rolled a " + fp.getRandom3());
				System.out.println("CPU rolled a " + fp.getRandom4());

					if(fp.getRandom3() > fp.getRandom4())
				{
					System.out.println("You won the round.");
					fp.score1++;
					cround++;

							System.out.println("======================================================");
							System.out.println("Current Score: " + fp.getScore1());
							System.out.println("CPU Score: " + fp.getScore2());
							System.out.println("======================================================");
				}

				if(fp.getRandom4() > fp.getRandom3())
				{
					System.out.println("You lost the round.");
					fp.score2++;
					cround++;

						System.out.println("======================================================");
						System.out.println("Current Score: " + fp.getScore1());
						System.out.println("CPU Score: " + fp.getScore2());
						System.out.println("======================================================");
				}

				if(fp.getRandom3() == fp.getRandom4())
				{
					System.out.println("It was a tie!");
					cround++;

						System.out.println("======================================================");
						System.out.println("Current Score: " + fp.getScore1());
						System.out.println("CPU Score: " + fp.getScore2());
						System.out.println("======================================================");
				}



				if((cround == fp.getRounds()) && (fp.score1 > fp.score2) )
				{
					System.out.println();
					System.out.println("You Won the Game!");
					System.out.println("1. Play Again");
					System.out.println("2. Set Rounds");
					System.out.println("3. Set Sides");
					System.out.println("4. Set Bet");
					System.out.println("6. End Game");
					sel = scan.nextInt();
					if(sel == 1)
					{
						fp.score1 = 0;
						fp.score2 = 0;
						cround = 0;
					}

				}

				if((cround == fp.getRounds()) && (fp.score1 < fp.score2))
				{
					System.out.println();
					System.out.println("You Lost the Game.");
					System.out.println("1. Play Again");
					System.out.println("2. Set Rounds");
					System.out.println("3. Set Sides");
					System.out.println("4. Set Bet");
					System.out.println("6. End Game");
					sel = scan.nextInt();
					if(sel == 1)
					{
						fp.score1 = 0;
						fp.score2 = 0;
						cround = 0;
					}

				}

				if((cround == fp.getRounds()) && (fp.score1 == fp.score2))
				{
					System.out.println();
					System.out.println("You Tied.");
					System.out.println("1. Play Again");
					System.out.println("2. Set Rounds");
					System.out.println("3. Set Sides");
					System.out.println("4. Set Bet");
					System.out.println("6. End Game");
					sel = scan.nextInt();
					if(sel == 1)
					{
						fp.score1 = 0;
						fp.score2 = 0;
						cround = 0;
					}

				}
		}

			}

			else
			{
			System.out.println("Press 1 to roll your die");
		    roll = scan.nextInt();
			}

			}

			//Create a Word Document on Monday on how to play dice war 2.0

		}

		if(sel == 2)
		{
			System.out.println("Set the number of rounds in the game:");
			System.out.println("Choose a number between 1 and 10");
			int rounds = scan.nextInt();

			while(rounds < 1 || rounds > 10)
			{
			System.out.println("Choose a number between 1 and 10");
			System.out.println("Set the number of rounds in the game:");
	        rounds = scan.nextInt();
			}

			fp.setRounds(rounds);
			scan.nextLine();
		}


     if(sel == 3)
		{
			System.out.println("Choose either 6 or 10");
			System.out.println("Set the number of Dice Sides:");
			int sides = scan.nextInt();

			while(sides != 6 && sides != 10)
			{
			System.out.println("Set the number of Dice Sides:");
			System.out.println("Choose either 6 or 10");
			sides = scan.nextInt();
			}

			fp.setSides(sides);
			scan.nextLine();
		}


     if(sel == 4)
		{
			System.out.println("Your bet must be lower than your cash");
			System.out.println("Set your bet:");
			int bet = scan.nextInt();

			while(bet > fp.cash || bet < 0)
			{
			System.out.println("Your bet must be lower than your cash");
			System.out.println("Set your bet:");
		    bet = scan.nextInt();
			}

			fp.setBet(bet);
			scan.nextLine();
		}


     if(sel == 5)
		{
			System.out.println("Your cash must be lower than $100,000 and greater than $0");
			System.out.println("Set your starting cash:");
			int cash = scan.nextInt();

			while(cash < 0 || cash > 100000 )
			{
			System.out.println("Your cash must be lower than $100,000 and greater than $0");
			System.out.println("Set your starting cash:");
			cash = scan.nextInt();
			}

			fp.setCash(cash);
			scan.nextLine();
		}
     }


     while(sel != 6);

     if(sel == 6)
     {
     System.out.println("Thanks for playing Lucky Dice War");
     }

  }
}