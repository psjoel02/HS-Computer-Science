//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwo
{
	private char[][] mat;

	public FancyWordTwo()
	{
		this("");
	}
	public FancyWordTwo(String word) 
	{
		createSquare(word);
	}
	private void createSquare(String word) 
	{
		char[] chars = word.toCharArray();
		int length = chars.length;
		int i_last = length-1;
		mat = new char[length][length];
		for(char[] row : mat) 
		{
			for(int i = 0; i < row.length; i++) 
			{
				row[i] = ' ';
			}
		}
		for(int i = 0; i < length; i++) 
		{
			char c = chars[i];
			mat[0][i] = c;
			mat[i][0] = c;
			mat[i_last][i_last-i] = c;
			mat[i_last-i][i_last] = c;
		}
	}
	public String toString()
	{
		String output="";
		for(char[] row : mat) 
		{
			for(char c : row) 
			{
				output += c;
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}