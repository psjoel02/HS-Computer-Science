import java.io.* ;
public class CCSU61E1
{

  public static void main ( String[] args )
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

    // declare and initialize three sums

    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
    	sum1 = (data[index] + sum1);
    }
    for ( int even=0; even < data.length; even++)
    {
    	if(data[even]%2 == 0)
    	{
    	sum2 = (data[even] + sum2);
    	}
    }
    for ( int odd=0; odd < data.length; odd++)
    {
    	if(data[odd]%2 != 0)
    	{
    	sum3 = (data[odd] + sum3);
    	}
    }

    // write out the three sums
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);


  }
}
