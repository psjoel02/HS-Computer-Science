import java.io.* ;
public class CCSU61E4
{

  public static void main ( String[] args )
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] result = new int[14];

    // copy the data in reversed order to result
    for ( int j=result.length-1; j >= result[0]; j--)
    {
      result[j] = data[j];
    }

    // write out the result
    for ( int j=result.length-1; j >= 0; j--)
    {
    	System.out.println(result[j]);

    }

  }
}


