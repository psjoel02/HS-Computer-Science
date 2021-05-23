public class Dance
{
   // Constants
   public final int GoldPass = 1;
   public final int SilverPass = 2;
   public final int BronzePass = 3;
   public final int NoPass = 4;
   
   // Instance Variables
	private int attendance;
	private double ticketsales;

   
   // Constructors
   public Dance()
   {
	attendance = 0;
	ticketsales = 0;

   }
   
   // Methods

   /** precondition:  value of code is in the range (1 to 4) inclusive.
    *  postcondition: updates the ticketSales by the price of the ticket 
    *     specified by the parameter code. The attendance variable is 
    *     incremented by one.
    *  @param code a value from (1 - 4) indicating the type of ticket
    */
   public void buyTicket(int code)
   {
   	
		if(code >= 1 && code <= 4)
		{
			if(code == 1)
			{
				attendance++;
			}
			if(code == 2)
			{
				ticketsales += 2;
				attendance++;
			}
			if(code == 3)
			{
				ticketsales += 4;
				attendance++;
			}
			if(code == 4)
			{
				ticketsales += 6;
				attendance++;
			}
			
		}

   }

   /** @return the value of attendance
    */
   public int getAttendance()
   {	
   	  System.out.print("Total Attendance = ");
      System.out.println(attendance);
      return attendance;
   }
   
   /** @return the amount of ticketSales
    */
   public double getTicketSales()
   {
   	 System.out.print("Ticket Sales = $"); 
     System.out.println(ticketsales);
     return ticketsales;
   } 
}