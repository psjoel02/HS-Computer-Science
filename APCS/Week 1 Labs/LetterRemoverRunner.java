//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover testcase1 = new LetterRemover("I am Sam I am", "a");
		System.out.println(testcase1 + "\n");

		LetterRemover testcase2 = new LetterRemover("ssssssssxssssesssssesss", "s");
		System.out.println(testcase2 + "\n");

		LetterRemover testcase3 = new LetterRemover("qwertyqwertyqwerty", "a");
		System.out.println(testcase3 + "\n");

		LetterRemover testcase4 = new LetterRemover("abababababa", "b");
		System.out.println(testcase4 + "\n");

		LetterRemover testcase5 = new LetterRemover("abaababababa", "x");
		System.out.println(testcase5 + "\n");

	}
}