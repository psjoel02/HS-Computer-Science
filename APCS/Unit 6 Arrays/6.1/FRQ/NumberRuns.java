public class NumberRuns
{
    // Part (a)
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
    * @param cube a NumberCube
    * @param numTosses the number of tosses to be recorded
    * Precondition: numTosses > 0
    * @return an array of numTosses values
    */
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
  int[] tosses = new int[numTosses];

  for (int i = 0; i < numTosses; i++)
  {
    tosses[i] = cube.toss();
  }

  return tosses;


    }

    // Part (b)
    /** Returns the starting index of a longest run of two or more consecutive repeated values
    * in the array values.
    * @param values an array of integer values representing a series of number cube tosses
    * Precondition: values.length > 0
    * @return the starting index of a run of maximum size;
    * -1 if there is no run
    */
    public static int getLongestRun(int[] values)
    {
		 int maxLength = 0;
		 int maxStart = -1;
		 int currentLength = 0;

		 for (int i = 0; i < values.length-1; i++)
		 {
		 if (values[i] == values[i+1])
		 {
		 currentLength++;

			 if (currentLength > maxLength)
			 {
			 maxLength = currentLength;
			 maxStart = i - currentLength + 1;
			 }

		 }
		 else
		 {
		 currentLength = 0;
		 }
		 }
		 return maxStart;
}



    public void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
                System.out.printf("%3d", i);
        }
        System.out.println();
        for(int n : arr)
        {
                System.out.printf("---");
        }
        System.out.println();

        for(int n : arr)
        {
                System.out.printf("%3d", n);
        }
        System.out.println();

        System.out.println();
        System.out.println("Index of Longest Run = " + getLongestRun(arr));
        System.out.println();
    }

    public static void main(String[] args)
    {
        NumberRuns app = new NumberRuns();

        int[] toss1 = app.getCubeTosses(new NumberCube(), 17);
        app.print(toss1);

        int[] toss2 = app.getCubeTosses(new NumberCube(), 17);
        app.print(toss2);

        int[] toss3 = app.getCubeTosses(new NumberCube(), 17);
        app.print(toss3);

        int[] toss4 = {1,3,2,4,6,5,1,3,2,4,6,5,1,3,2,4};
        app.print(toss4);
    }
}