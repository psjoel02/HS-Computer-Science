
import java.io.* ;
public class CCSU61E3
{




  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    // declare and initialize variables
    int closest = 0;

    // find the element nearest to zero
    for ( int item: data )
    {
    	if(item - 1 == 0)
    	{
    		closest = data[item];
    	}
    }

    // write out the element nearest to zero
    System.out.println(closest);

  }
}
