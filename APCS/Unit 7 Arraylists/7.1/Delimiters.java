import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;
    
    /** Constructs a Delimiters object where open is the open delimiter and close is the
    * close delimiter.
    * Precondition: open and close are non-empty strings.
    */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public String getOpenDel()
    {
        return openDel;
    }

    public String getCloseDel()
    {
        return closeDel;
    }
    //-------------------------------- Part A -------------------------------//
    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].equals(getOpenDel()) || tokens[i].equals(getCloseDel()))
                list.add(tokens[i]);
        }
        return list;
    }
    
    //-------------------------------- Part B -------------------------------//
    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
    *   Precondition: delimiters contains only valid open and close delimiters.
    */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int open = 0, close = 0;

        for (int i = 0; i < delimiters.size(); i++)
        {
            if(delimiters.get(i).equals(getOpenDel()))
                open++;
            if(delimiters.get(i).equals(getCloseDel()))
                close++;
            if(close > open)
                return false;
        }
        if (close == open)
            return true;
        else
            return false;
    }
}