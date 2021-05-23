public class PiggyBankManager
{
     public static void main(String[] args)
     {
	 PiggyBank bank = new PiggyBank();      // instantiate object
bank.insertDime();          // add a dime
bank.insertQuarter();       // add a quarter
bank.insertPenny();         // add a penny
bank.insertNickel();        // add a nickel
bank.insertQuarter();       // add a quarter
bank.insertDime();          // add a dime
bank.insertPenny();         // and a penny

System.out.println("Your bank has been smashed!");
System.out.println("You saved " + bank.smashBank() + " cents.");
System.out.println();
     }
}