import java.util.*;
public class MyList
{

   // Instance variables
   private int a[];
   private int listLen;

   // Constructor
   public MyList(int len)
   	{
      a = new int[len];
      listLen = len;
   	}

   // You may use this method as needed
   private void swap(int x, int y)
   	{
      int temp = a[x];
      a[x] = a[y];
      a[y] = temp;
    }

    // You will add the following methods:

         public void init()
         {

         	for(int i = 0; i < listLen;i++)
         	{

         		a[i] = (int)(Math.random() * listLen * 10) + 1;

         	}
         }


         public void displayList()
         {
         	for(int i = 0; i < listLen;i++)
         	{
         		System.out.println("Element " + i + ": " + a[i] + " ");
         	}

         }

         public void displayElement(int pos)
         {
         	System.out.println(a[pos]);
         }

         public boolean linearSearch(int sn)
			{
				boolean found = false;
				int k = 0;


					while (k < listLen && !found)
					{
						if (a[k] == sn)
							found = true;
						else
							k++;
					}
				System.out.println(found);
					return found;
	    	}


			public void bubbleSort()
		{
			for (int p = 1; p < listLen; p++)
				{
				for (int q = 0; q < listLen-p; q++)
				{

					if (a[q] > a[q+1])
					{

						swap(q,q+1);
						displayList();
						pause();
					}
				}
			}
		}



         public boolean binarySearch(int sn)
		{
			boolean found = false;
			int lo = 0;
			int hi = listLen-1;

			while (lo <= hi && !found)
				{
					int mid = (lo + hi) / 2;

					if (a[mid] == sn)
					{
						found = true;
						System.out.println(found);
					}
					else if(a[hi] == sn)
					{
						found = true;
						System.out.println(found);
					}
					else if (a[lo] == sn)
					{
						found = true;
						System.out.println(found);
					}

					else
					{
						if (sn > a[mid])
							lo = mid + 1;
						else
							hi = mid - 1;
					}
				}

			return found;
		}

         public void selectionSort()
			{
				for (int p = 0; p < listLen-1; p++)
				{
					int smallest = p;
					for (int q = p+1; q < listLen; q++)
						if (a[q] < a[smallest])
						smallest = q;

					if (a[p] != a[smallest])
					swap(p,smallest);
					displayList();
						pause();
				}

			}


         public void insertionSort()
			{
				int i, j, newValue;

					for (i = 1; i < a.length; i++)
					{
	     				newValue = a[i];
	     				j = i;
	     			while (j > 0 && a[j - 1] > newValue)
	     				{
	           				a[j] = a[j - 1];
	           				j--;

	     				}
					displayList();
						pause();
	     			a[j] = newValue;
					displayList();
						pause();
					}
			}
		public static void pause()
		{

		Scanner keyboard = new Scanner(System.in);
		String dummy;
		System.out.print("\nPress <Enter> to continue ");
		dummy = keyboard.nextLine();

		}


public static void main(String[]args)
	{
        Scanner scan = new Scanner(System.in);

		int sel;
        System.out.print("How long would you like your list?" + " ");
                int num = scan.nextInt();
                MyList mylist = new MyList(num);



		do{

			sel = 0;
	  System.out.println("----------------------------------------------");
      System.out.println("1: To initialize the list to random #'s: 		");
      System.out.println("2: To display the entire list:            	");
	  System.out.println("3: To display a specific element of the list  ");
	  System.out.println("4: To search the list via LinearSearch:  		");
	  System.out.println("5: To search the list via BinarySearch:  		");
	  System.out.println("6: To sort the list via BubbleSort:      		");
	  System.out.println("7: To sort the list via SelectionSort:   		");
	  System.out.println("8: To sort the list via InsertionSort:   		");
	  System.out.println("9: To quit the program:                  		");
	  System.out.println("----------------------------------------------");
	  sel = scan.nextInt();
	  if(sel == 1)
	  {
        mylist.init();
	  }
	  if(sel == 2)
	  {
		mylist.displayList();
	  }
	  if(sel == 3)
	  {
	  	int elem = 0;
	  	System.out.println("What element would you like to display?");
	  	elem = scan.nextInt();
	  	mylist.displayElement(elem);

	  }
	  if(sel == 4)
	  {
	  	int lsear = 0;
	  	System.out.println("What element value would you like to search for? (LS)");
	  	lsear = scan.nextInt();
	  	mylist.linearSearch(lsear);


	  }
	  if(sel == 5)
	  {
	  	int bsear = 0;
	  	System.out.println("What element value would you like to search for? (BS)");
	  	bsear = scan.nextInt();
	  	mylist.binarySearch(bsear);

	  }
	  if(sel == 6)
	  {
		mylist.bubbleSort();

	  }
	  if(sel == 7)
	  {
		mylist.selectionSort();
	  }
	  if(sel == 8)
	  {
	  	mylist.insertionSort();
	  }
		}
		while(sel != 9);
			System.out.println("End of process.");



	}
}