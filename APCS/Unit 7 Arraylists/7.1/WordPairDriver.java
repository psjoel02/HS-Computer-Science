import java.util.*;

public class WordPairDriver
{
    public static void main(String[] args)
    {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        exampleOne.print();
        int matches1 = exampleOne.numMatches();
        System.out.println("Matches = " + matches1);
        System.out.println();
        
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        exampleTwo.print();
        int matches2 = exampleTwo.numMatches();
        System.out.println("Matches = " + matches2);
        System.out.println();
        
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        exampleThree.print();
        int matches3 = exampleThree.numMatches();
        System.out.println("Matches = " + matches3);
        System.out.println();
    }
}
