import java.util.*;

public class Utility
{
    private static Scanner keyboard = new Scanner(System.in);

    /** This method prompts a user to enter
     *  an integer value from the keyboard. It
     *  then reads and returns the integer value
     *  using the Scanner class's nextInt method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static int readInt(String prompt)
    {
		int x = 0;

    	System.out.print(prompt);
    	x = keyboard.nextInt();
    	keyboard.nextLine();

    	return x;
    }

    /** This method prompts a user to enter
     *  a double value from the keyboard. It
     *  then reads and returns the double value
     *  using the Scanner class's nextDouble method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static double readDouble(String prompt)
    {
    	double x = 0;

    	System.out.print(prompt);
    	x = keyboard.nextDouble();
    	keyboard.nextLine();

    	return x;
    }

    /** This method prompts a user to enter
     *  a string from the keyboard. It then
     *  reads and returns the string using
     *  the Scanner class's nextLine method.
     *  @param prompt the user prompt
     *  @return the value read from keyboard
     */
    public static String readString(String prompt)
    {
    	String x = "null";

    	System.out.print(prompt);
    	x = keyboard.nextLine();

    	return x;
    }

    /** This method prints blank lines on the
     *  console window.
     *  @param num the number of lines to display
     */
    public static void blankLines(int num)
    {
		for(int x = 0; x < num; x++) {
    		System.out.println();
    	}
    }
}