import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	private String word;

	public FancyWord()
	{
		word = "hello";
	}

   public FancyWord(String s)
	{

	   word = s;
	   mat = new char[word.length()][word.length()];
	   for (int i = 0; i < mat.length; i++) {
		Arrays.fill(mat[i], ' ');
	}
	   for(int i=0; i < word.length(); i++)
		{
		mat[0][i] = word.charAt(i);
		mat[mat.length - 1][i] = word.charAt(i);
		mat[i][i] = word.charAt(i);
		mat[i][(word.length() - 1) - i] = word.charAt((word.length() - 1) - i);
		}

	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < mat.length; i++) {
			output += (Arrays.toString(mat[i])) + "\n";
		}



		return output+"\n\n";
	}
}