import java.util.*;

public class WordPairList 
{
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;
    
    // Part (a)
    /** Constructs a WordPairList object as described in part(a).
     *  Precondition:words.length >= 2
     */
    
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<>();
        for(int i = 0; i < words.length - 1; i++)
        {
            for(int j = i + 1; j < words.length; j++)
            {
                WordPair obj = new WordPair(words[i], words[j]);
                allPairs.add(obj);
            }
        }
    }
    
    // Part (b)
    /** Returns the number of matches as described in part(b).
     */
    public int numMatches()
    {
        int count = 0;
        for (int i = 0; i < allPairs.size() - 1; i++)
        {
            if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond()))
                count++;
        }
        return count;
    }
    
    
    
    
    
    public void print()
    {
        for(int i = 0; i < allPairs.size(); i++)
        {
            WordPair pair = allPairs.get(i);
            if(i % 3 == 0)
                System.out.println();
            System.out.print("(" + pair.getFirst() + ", " + pair.getSecond() + ") ");  
        }
        System.out.println();
    }
}
