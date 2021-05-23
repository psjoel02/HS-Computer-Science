public class SlotMachine
{
    // constants
	public final int CHERRIES = 0;
	public final int APPLE = 1;
	public final int ORANGE = 2;
	public final int LEMON = 3;
	public final int BANANA = 4;

    // instance variables
	private int roller1;
	private int roller2;
	private int roller3;
	public int cash = 50;     // $50 is the amount of money you start with

    	// methods
		/* This method randomly selects a fruit for each of the three rollers.
 		*/
		public void pullLever()
		{
          roller1 = (int)(Math.random()*5);
          roller2 = (int)(Math.random()*5);
          roller3 = (int)(Math.random()*5);
		}

		/* This method displays the type of fruit contained in each roller.
 		*/
		public void displayRollers()
		{
			System.out.println();
          if(roller1 == 0)
          {
          	System.out.print("CHERRIES" + " ");
          }
          if(roller1 == 1)
          {
          	System.out.print("APPLE" + " ");
          }
          if(roller1 == 2)
          {
          	System.out.print("ORANGE" + " ");
          }
          if(roller1 == 3)
          {
          	System.out.print("LEMON" + " ");
          }
          if(roller1 == 4)
          {
          	System.out.print("BANANA" + " ");
          }

          if(roller2 == 0)
          {
          	System.out.print("CHERRIES" + " ");
          }
          if(roller2 == 1)
          {
          	System.out.print("APPLE" + " ");
          }
          if(roller2 == 2)
          {
          	System.out.print("ORANGE" + " ");
          }
          if(roller2 == 3)
          {
          	System.out.print("LEMON" + " ");
          }
          if(roller2 == 4)
          {
          	System.out.print("BANANA" + " ");
          }
          if(roller3 == 0)
          {
          	System.out.print("CHERRIES" + " ");
          }
          if(roller3 == 1)
          {
          	System.out.print("APPLE" + " ");
          }
          if(roller3 == 2)
          {
          	System.out.print("ORANGE" + " ");
          }
          if(roller3 == 3)
          {
          	System.out.print("LEMON" + " ");
          }
          if(roller3 == 4)
          {
          	System.out.print("BANANA" + " ");
          }

		}
		/* This method determines the amount of pay off when there is a winner
 		* @ return the amount of payoff
	 	*/
		private int getPayOff()
		{
		int rand = (int)(Math.random() * 10);

		if (rand >= 0 && rand < 6)
		{
    		return ((int)Math.random() * 11) + 1;
		}
		else if (rand >= 6 && rand < 9)
		{
    		return ((int)Math.random() * 101) + 11;
		}
		else
			{
    		return 10000;
		    }
		}
		/* This method displays the results of pulling the lever.
	 	*/
		public void displayResults()
		{
          cash--;
          if(roller1 == roller2 && roller2 == roller3 && roller1 == roller3)
          {
          	System.out.println();
          	System.out.println("************************");
          	System.out.println("         Winner         ");
          	System.out.println("************************");
          	System.out.println("");
          	System.out.println("");
          	System.out.println("You won $" + getPayOff());
          	System.out.println("Cash = $" + (cash + getPayOff()));

          }
          else
          {
          	System.out.println();
          	System.out.println();
          	System.out.println("No winner. Please try again.");
          	System.out.println("cash = $" + cash);
          }
		}
}