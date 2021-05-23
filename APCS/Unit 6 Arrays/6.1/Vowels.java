import java.util.Scanner;
public class Vowels {

    private static String[] words = new String[10];

    public void countVowels(String s)
    {
    	int vowels = 0;
    	for(int i = 0; i < s.length(); i++)
    	{
    		if(s.charAt(i) == 'a')
    		{
    		vowels++;
    		}
    		else if(s.charAt(i) == 'e')
    		{
    		vowels++;
    		}
    		else if(s.charAt(i) == 'i')
    		{
    		vowels++;
    		}
    		else if(s.charAt(i) == 'o')
    		{
    		vowels++;
    		}
    		else if(s.charAt(i) == 'u')
    		{
    		vowels++;
    		}
    	}
    	System.out.print(s + " - ");
		System.out.println(vowels);
    }

    public static void main (String[] args)
    {
    	Vowels app = new Vowels();
    	Scanner scan = new Scanner(System.in);

    	System.out.println("Enter 10 words:");

    	System.out.print("Word 1 -->");
    	String one = scan.nextLine();
		words[0] = one;

    	System.out.print("Word 2 -->");
    	String two = scan.nextLine();
		words[1] = two;

    	System.out.print("Word 3 -->");
    	String three = scan.nextLine();
		words[2] = three;

    	System.out.print("Word 4 -->");
    	String four = scan.nextLine();
		words[3] = four;

    	System.out.print("Word 5 -->");
    	String five = scan.nextLine();
		words[4] = five;

    	System.out.print("Word 6 -->");
    	String six = scan.nextLine();
		words[5] = six;

    	System.out.print("Word 7 -->");
    	String seven = scan.nextLine();
		words[6] = seven;

    	System.out.print("Word 8 -->");
    	String eight = scan.nextLine();
		words[7] = eight;

    	System.out.print("Word 9 -->");
    	String nine = scan.nextLine();
		words[8] = nine;

    	System.out.print("Word 10 -->");
    	String ten = scan.nextLine();
		words[9] = ten;
		
		System.out.println();
		
    	app.countVowels(words[0]);
    	app.countVowels(words[1]);
    	app.countVowels(words[2]);
    	app.countVowels(words[3]);
    	app.countVowels(words[4]);
    	app.countVowels(words[5]);
    	app.countVowels(words[6]);
    	app.countVowels(words[7]);
    	app.countVowels(words[8]);
    	app.countVowels(words[9]);

    }
}