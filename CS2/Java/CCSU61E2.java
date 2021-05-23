import java.io.* ;
public class CCSU61E2
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    // declare and initialize variables for the two largest
    int largest1 = 0;
    int largest2 = 0;

    // compute the two largest
    for ( int index=0; index < data.length; index++)
    {
    	if(data[index] == data[5])
    largest1 = data[index];
    }
    for ( int index=0; index < data.length; index++)
    {
    	if(data[index] == data[7])
    largest2 = data[index];
    }

    // write out the two largest
    System.out.println(largest1);
    System.out.println(largest2);

  }

}