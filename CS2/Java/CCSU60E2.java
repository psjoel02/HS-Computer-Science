/**
 * @(#)CCSU60E2.java
 *
 *
 * @author
 * @version 1.00 2019/3/3
 */


public class CCSU60E2
{

  public static void main ( String[] args )
  {
    int[] val = {13, -4, 82, 17};


    System.out.println( "Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    // Construct an array object for twice.
    int[] twice = {13,-4,82,17};
    twice[0] = (twice[0]*2);
    twice[1] = (twice[1]*2);
    twice[2] = (twice[2]*2);
    twice[3] = (twice[3]*2);
    // Put values in twice that are twice the
    // corresponding values in val.



    System.out.println( "New Array: "
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
   }
}

