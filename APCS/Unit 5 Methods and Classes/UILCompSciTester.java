import java.util.*;
public class UILCompSciTester
{

public static void main(String[] args)
    {

	String name = UILCompSci.readName("Enter contestant's name -->");
	int correct = UILCompSci.readCorrect("Number correct -->");
	int incorrect = UILCompSci.readIncorrect("Number incorrect -->");

	int skips = (40-(correct + incorrect));
	int score = ((correct *6 )-(incorrect * 2));

	System.out.println();
	System.out.println("Contestant's Name : " + name);
	System.out.println("Correct           : " + correct);
	System.out.println("Incorrect         : " + incorrect);
	System.out.println("Skips             : " + skips);
	System.out.println("-----------------------");
	System.out.println("Score             : " + score);

    }
}