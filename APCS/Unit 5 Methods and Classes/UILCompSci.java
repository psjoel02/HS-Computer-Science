import java.util.*;

public class UILCompSci {

    private static Scanner keyboard = new Scanner(System.in);


	public static String readName(String prompt)
	{
		System.out.print("Enter contestant's name -->");
		String str = keyboard.nextLine();

		return str;

	}

	public static int readCorrect(String prompt)
	{
		System.out.print("Number correct -->");
		int correct = keyboard.nextInt();
		keyboard.nextLine();
		return correct;
	}

	public static int readIncorrect(String prompt)
	{
		System.out.print("Number incorrect -->");
		int incorrect = keyboard.nextInt();
		keyboard.nextLine();
		return incorrect;
	}






}