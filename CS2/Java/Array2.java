
import java.util.Scanner;
import java.util.Arrays;
 public class Array2
{

public static void main(String[]args)
{
         int[] arr = new int[10];

		int maxSize = 0;
        int ind = 0;
        int val = 0;
        Scanner scan = new Scanner(System.in);



        System.out.println("Enter 10 integers. ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}


		int sel;
        do
        {
       		sel = 0;
       		System.out.println("---------------------------------------------------------------");
      		System.out.println("1: To display the array and each element's corresponding index ");
      		System.out.println("2: To initialize the value of each of the elements to ( - 1 )  ");
      		System.out.println("3: To set a given element to a provided value				   ");
      		System.out.println("9: To quit the program										   ");
      		System.out.println("---------------------------------------------------------------");
      		sel = scan.nextInt();

        System.out.println();

        if(sel == 1)
        {
		  for (int element: arr)
        	{
            System.out.println(element);

            if(ind <= arr.length)
            	{
              System.out.println("Index:" + ind);
            	}
				ind++;

        	}

        }

        if(sel == 2)
        {
        for(int spot=0; spot<arr.length; spot++)
 			{
    		arr[spot] = -1;
			}
        }
        if(sel == 3)
        {
        	int val2 = 0;
        	System.out.println("What element would you like to provide a value to?");
        	val2 = scan.nextInt();
        	for(int i = 0; i <= val2;i++)
        	{
        		if(i == val2)
        		{
        			int val3 = 0;
        			System.out.println("What value would you like to assign?");
        			val3 = scan.nextInt();
        			arr[i] = val3;
        		}
        	}
        }
}
        while(sel != 9);



}
Array2(int maxSize)
{
	maxSize = Integer.MAX_VALUE;
}



Array2[]array2 = new Array2[10];
public int len()
{
return array2.length+1;
}

public boolean add(int i)
{
while(i < array2.length)
	if(i == array2.length-1)
	{
	array2[array2.length-1] = array2[i];
	return true;
	}

	else if (array2.length-1 != 0)
	return false;

	i++;
}



public boolean add(int index,int value)
{
for(int i = 0; i < array2.length; i++)
{
	if(index == array2.length)
	{
		if(array2[index] == array2[11])
			return false;
		if(index > array2.length || index < array2[0])
			return false;
	}

}
}

public int get(int index)
{
	if(index > array2.length || index < array2[0])
		return -1;

return array2[index];



}

public void display()
{

for(int i = 0; i < array2.length; i++)
{
	System.out.println(array2[i]);
}
}
int set(int index, int value)
{
array2[index] = value;

if(index > array2.length || index < array2[0])
		return -1;
else
return value;

}
int remove(int index)
{
array2[index] = 0;
if(index > array2.length || index < array2[0])
		return -1;
}

}






