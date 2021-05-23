import java.util.Scanner;
public class Cereal
{	
	private String name;
	private int protein;
	private int sugar;
	
	public Cereal()
	{
		this("", 0, 0);
	}
	public Cereal(String n, int p, int s)
	{
		name = n;
		protein = p;
		sugar = s;
		
	}
	public String getName()
	{
		return  name;
	}
	public int getProtein()
	{
		return protein;
	}
	public int getSugar()
	{
		return sugar;
	}
	public String toString()
	{
		return name + " " + protein + " " + sugar;
	}
}