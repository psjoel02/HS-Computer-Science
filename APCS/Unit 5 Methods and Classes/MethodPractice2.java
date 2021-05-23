import java.util.*;

public class MethodPractice2
{
    private Scanner keyboard = new Scanner(System.in);
      // Implement methods below this line
	public void greeting(String firstName, int num)
	{
		for(int i = 0; i < num; i++)
		{
		System.out.println(firstName +", have a nice day.");
		}
	}

	public void range(int begin, int end)
	{
		while (begin <= end)
		{
			System.out.println(begin);
			begin++;
		}
	}

	public boolean compare(String str)
	{
		if(str.charAt(0) == str.charAt(str.length()-1))
		{
			return true;
		}

		return false;
	}

	public String reverse(String str)
	{
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			rev += str.charAt(i);
		}

		return rev;
	}

	public int numOccurrences(String word, String letter)
	{
		int y = 0;
		String temp1 = word;
		String temp2 = letter;

		for(int x = word.length(); x > 0; x--) {
			temp1 = word.substring(x - 1, x);
			if(temp1.equalsIgnoreCase(temp2))
				y++;
		}
		return y;
	}
    public static void main(String[] args)
    {
        MethodPractice2 app = new MethodPractice2();

        System.out.println("******************");
        System.out.println("   Test greeting");
        System.out.println("******************");
        app.greeting("Kendall", 6);

        System.out.println("\n\n******************");
        System.out.println("   Test range");
        System.out.println("******************");
        app.range(10, 15);

        System.out.println("\n\n******************");
        System.out.println("   Test compare");
        System.out.println("******************");
        System.out.println(app.compare("demand"));
        System.out.println(app.compare("football"));
        System.out.println(app.compare("bulb"));

        System.out.println("\n\n******************");
        System.out.println("   Test reverse");
        System.out.println("******************");
        System.out.println(app.reverse("ball"));
        System.out.println(app.reverse("courage"));
        System.out.println(app.reverse("hamburger"));

        System.out.println("\n\n******************");
        System.out.println("   Test numOccurrences");
        System.out.println("******************");
        System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
        System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
        System.out.println(app.numOccurrences("TEXAS", "R"));
        System.out.println();
    }
}
