public class SelfDivisor
{
    //***********
    // Part (a)
    //***********
    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *         false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
	int num = number;
	while(num > 0)
	{
		int digit = num % 10;
		if(digit == 0 || number % digit != 0)
		return false;
		num /= 10;
	}
	return true;

    }

    //************
    // Part (b)
    //************
    /** @param start starting point for values to be checked
     *         Precondition: start > 0
     *  @param num the size of the array to be returned
     *         Precondition: num > 0
     *  @return an array containing the first num integers >= start that are self-divisors
     */
     public static int[] firstNumSelfDivisors(int start, int num)
     {
	 int[] self = new int[num];
	 int nums = 0;
	 int nextNum = start;
	 while(nums < num)
	 {
	 	if(isSelfDivisor(nextNum) == true)
	 	{
	 		self[nums] = nextNum;
	 		nums++;
	 	}
	 	nextNum++;
	 }
		return self;
     }

     // There may be fields, constructors, and methods that are not shown.

     public static void main(String[] args)
     {
     	// Test isSelfDivisor
     	int num = 128;
     	if(isSelfDivisor(num))
     	{
     	   System.out.println(num + " is a self-divisor.");
     	}
     	else
     	{
     	   System.out.println(num + " is not a self-divisor.");
     	}

        num = 26;
        if(isSelfDivisor(num))
     	{
     	   System.out.println(num + " is a self-divisor.");
     	}
     	else
     	{
     	   System.out.println(num + " is not a self-divisor.");
     	}

     	num = 420;
     	if(isSelfDivisor(num))
     	{
     	   System.out.println(num + " is a self-divisor.");
     	}
     	else
     	{
     	   System.out.println(num + " is not a self-divisor.");
     	}

     	// Test firsNumSelfDivisors
     	System.out.println();
     	int[] list = firstNumSelfDivisors(20, 5);
     	System.out.print("firstNumSelfDivisors(20, 5)-->");
     	print(list);
     	list = firstNumSelfDivisors(500, 10);
     	System.out.print("firstNumSelfDivisors(500, 10)-->");
     	print(list);
     	System.out.println();
     }

     public static void print(int[] list)
     {
     	for(int n : list)
     	{
            System.out.print(n +  " ");
     	}
     	System.out.println();
     }
}