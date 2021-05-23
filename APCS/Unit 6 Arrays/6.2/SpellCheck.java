import java.util.*;
import java.io.*;

public class SpellCheck
{
        // constant
        public static final int LIST_SIZE = 150000;
        
	// instance variable
	private String[] wordList;   // list of words
        private int numWords = 0;   // logical size of wordList
	
	// constructor
	public SpellCheck()
	{
	   wordList  = new String[LIST_SIZE];
	   readFile();
	   searchWords();	
	}
	
	// Performs a binary search on the wordlist looking for key.
	// If key is found, it returns true;  
	// otherwise it returns false
	public boolean binarySearch(String key)
	{
   int left = 0;                           // Establish the initial
   int right = numWords - 1;               // endpoints of the array
        
   while(left <= right)                    // Loop until endpoints cross
   {
       int mid = (left + right) / 2;
       int midpoint = wordList[mid].compareTo(key);
       	  // Compute the current midpoint
       if(midpoint == 0)              // Target found; return its index
          return true;
       else if(midpoint < 0)         // Target to right of midpoint
          left = mid + 1;
       else                                // Target to left of midpoint
          right = mid - 1;
   }
	return false;
	}
	
	// Interface used to check spelling of words
	public void searchWords()
	{
		Scanner keyboard = new Scanner(System.in);
		String ans="Y";
		while(ans.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter word -->");
			String word = keyboard.nextLine();
			System.out.println();
			
			if(binarySearch(word) == true)
			   System.out.println(word + " is spelled correctly.");
			else
			{
			   System.out.println(word + " is spelled incorrectly!");
			}
			
			System.out.println();
			System.out.print("Enter another word[Y/N]? ");
			ans = keyboard.nextLine();
			System.out.println();
		}
	}
	
	// Populates wordlist from a text file of words
        // Updates logical size of wordList
	public void readFile()
	{
		System.out.println("Reading wordlist ...");
		System.out.println();
		Scanner scan=null;
		try
		{
			scan = new Scanner(new File("spellcheck.txt"));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found.");
		}
		
		while(scan.hasNextLine())
		{
			String str = scan.nextLine();
			wordList[numWords] = str;
                        numWords++;
		}			
	}
	
	public static void main(String[] args)
	{
		SpellCheck spellCheck = new SpellCheck();
	}
}