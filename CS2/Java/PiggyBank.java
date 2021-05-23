public class PiggyBank
{
private int quarters;   // number of quarters
private int dimes;      // number of dimes
private int nickels;    // number of nickels
private int pennies;    // number of pennies
public int totalCents;
    // instance variables

    // increases the number of quarters in the bank by one
public void insertQuarter()
{
 quarters++;
}

// increases the number of dimes in the bank by one
public void insertDime()
{
 dimes++;
}

// increases the number of nickels in the bank by one
public void insertNickel()
{
 nickels++;
}

// increases the number of pennies in the bank by one
public void insertPenny()
{
 pennies++;
}

/* This method returns the total number of cents in the piggy bank
 * @ return total cents in the bank
 */

public int smashBank()
{
 return totalCents = (quarters * 25 + dimes * 10 + nickels * 5 + pennies);
}
    // methods

}