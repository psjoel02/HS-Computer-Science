import java.util.Scanner;

class WordList
{




	public static void main(String[]args)
	{
	 Scanner scan = new Scanner(System.in);
	 String[]wordlist = new String[10];

	 System.out.println("Enter 10 words:");
	 for (int w = 0; w < wordlist.length; w++)
	 {
	 	wordlist[w] = scan.next();
	 }
	 System.out.println();


	 for(String s : wordlist)
	 {
	 	System.out.println(s);
	 }



	}







}