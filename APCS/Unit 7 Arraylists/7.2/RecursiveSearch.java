import java.util.*;

public class RecursiveSearch
{
	Scanner keyboard = new Scanner(System.in);
	int[] list =  {75, 43, 23, 9, 81, 12, 61, 55, 89, 2, 37, 14};
	int[] list2 = {2, 9, 12, 14, 23, 37, 43, 55, 61, 75, 81, 89};

	public RecursiveSearch()
	{
		linearSearchTest();
		binarySearchTest();
	}

	// part A
	/* This method performs a linear search using a recursive algorithm.
	 * @param list the array to be searched
	 * @param length list.length - 1
	 * @param key the search key
     * @return true if key found; otherwise false
     */
	public boolean linearSearch(int[] list, int length, int key)
    {
	   
	   if(length < 0)
	   	{
	      return false;
	   	}
	   if(list[length] == key)
	   {
	      return true;
	   }
	   else
	   {
	      return linearSearch(list, length-1, key);
	   }

    }

	// part B
	/* This method performs a binary search using a recursive algorithm.
	 * @param list the array to be searched
	 * @param left the left index of list to be searched
	 * @param right the right index of list to be searched
	 * @param key the search key
     * @return true if key found; otherwise false
     * precondition: list is sorted
     */
    public boolean binarySearch(int[] list, int left, int right, int key)
    {
	left = 0;
	right = list.length - 1;
	binarySearch(list, left, right, key);
	   int midpoint = (left + right)/ 2;
	   if(left > right)
	   {
	      return false;
	   }
	   if (list[midpoint] == key)
	   {
	      return true;
	   }
	   if (list[midpoint] < key)
	   {
	      return binarySearch(list, midpoint + 1, right, key);
	   }
	   else
	   {
	      return binarySearch(list, left, midpoint - 1, key);
	   }
    }

	public void linearSearchTest()
	{
		Scanner keyboard = new Scanner(System.in);
        String ans;

        System.out.println("======================");
        System.out.println("  Linear Search Test");
        System.out.println("======================");
        printArray(list);

        do
        {
            System.out.print("Enter a key --> ");
            int key = keyboard.nextInt();

            if(linearSearch(list, list.length-1, key) == true)
                System.out.println(key + " found!");
            else
                System.out.println(key + " not found!");

            System.out.println();
            System.out.print("Another[Y/N]? ");
            keyboard.nextLine();
            ans = keyboard.nextLine();
            System.out.println();
       }
       while(ans.equalsIgnoreCase("y"));
	}

	public void binarySearchTest()
	{
		Scanner keyboard = new Scanner(System.in);
        String ans;

        System.out.println("=====================");
        System.out.println("  Binary Search Test");
        System.out.println("=====================");
        printArray(list2);

        do
        {
            System.out.print("Enter a key --> ");
            int key = keyboard.nextInt();

            if(binarySearch(list2, 0, list2.length-1, key) == true)
                System.out.println(key + " found!");
            else
                System.out.println(key + " not found!");

            System.out.println();
            System.out.print("Another[Y/N]? ");
            keyboard.nextLine();
            ans = keyboard.nextLine();
            System.out.println();
       }
       while(ans.equalsIgnoreCase("y"));
	}

	public void printArray(int[] list)
	{
		System.out.println();
		for(int n : list)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();
	}

    public static void main(String[] args)
    {
        RecursiveSearch app = new RecursiveSearch();
    }
}