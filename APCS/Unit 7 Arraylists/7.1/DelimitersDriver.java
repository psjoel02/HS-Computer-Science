import java.util.ArrayList;

public class DelimitersDriver
{
    public static void main(String[] args)
    {
        System.out.println("Part A - getDelimiters Test");
        System.out.println("---------------------------");
        Delimiters del = new Delimiters("(", ")");
        
        String[] tokens = {"(", "x + y", ")", " * 5"};
        ArrayList<String> list = del.getDelimitersList(tokens);
        print(tokens, list);
        
        Delimiters del2 = new Delimiters("<q>", "</q>");
        
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        list = del2.getDelimitersList(tokens2);
        print(tokens2, list);
        
        System.out.println("Part B - isBalanced Test");
        System.out.println("---------------------------");
        
        Delimiters del3 = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        list = del3.getDelimitersList(tokens3);
        printTokens(tokens3);
        System.out.println("Delimiters are balanced: " + del3.isBalanced(list));
        System.out.println();
        
        String[] tokens4 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        list = del3.getDelimitersList(tokens4);
        printTokens(tokens4);
        System.out.println("Delimiters are balanced: " + del3.isBalanced(list));
        System.out.println();
        
        String[] tokens5 = {"<sup>"};
        list = del3.getDelimitersList(tokens5);
        printTokens(tokens5);
        System.out.println("Delimiters are balanced: " + del3.isBalanced(list));
        System.out.println();
        
        String[] tokens6 = {"<sup>", "<sup>", "</sup>"};
        list = del3.getDelimitersList(tokens6);
        printTokens(tokens6);
        System.out.println("Delimiters are balanced: " + del3.isBalanced(list)); 
        System.out.println();
        
        String[] tokens7 = {"<sup>", "<sup>", "<sup>","</sup>", "</sup>", "</sup>"};
        list = del3.getDelimitersList(tokens7);
        printTokens(tokens7);
        System.out.println("Delimiters are balanced: " + del3.isBalanced(list));
        System.out.println();
    }

    public static void print(String[] tokens, ArrayList<String> list)
    {
        System.out.print("Tokens: ");
        for(String s : tokens)
           System.out.print(s);
        System.out.println("\n");
        System.out.print("Delimiters: " + list);
        System.out.println("\n");
    }
    
    public static void printTokens(String[] tokens)
    {
        System.out.print("Tokens: ");
        for(String s : tokens)
           System.out.print(s);
        System.out.println();
    }
}