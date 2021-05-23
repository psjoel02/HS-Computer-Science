//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private String lookFor;

	public LetterRemover()
	{
		//call set
		sentence = "";
		lookFor = "";
	}

	public LetterRemover(String word, String del)
	{
		sentence = word;
		lookFor = del;
	}
	//add in second constructor


	public void setRemover(String s, String rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;

		int loc = sentence.indexOf(lookFor);
		while (loc > 0)
			{
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{

		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}