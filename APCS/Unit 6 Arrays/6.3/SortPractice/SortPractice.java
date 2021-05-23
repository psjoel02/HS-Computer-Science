import java.util.*;

public class SortPractice
{
    public static void selectionSort(String[] names)
    {
        for(int i = 0; i < names.length - 1; i++)
        {
            int min = i;
            for(int j = i+1; j < names.length; j++)
            {
               if(names[j].compareTo(names[min]) < 0)
               {
                   min = j;
               }
            }
            
            // swap code
            String temp = names[i];
            names[i] = names[min];
            names[min] = temp;
            
            System.out.print("Pass - " + (i+1) + " : ");
            printArray(names);        
        }
    }
    
    public static void insertionSort(Integer[] numbers)
    {
        int i, j, index;
                
        for (i=1; i < numbers.length; i++)
        {
           index = numbers[i];
           j = i;
           while ((j > 0) && (numbers[j-1].compareTo(index)) > 0)
           {
               numbers[j] = numbers[j-1];
               j = j - 1;
           }
           numbers[j] = index;
           
           System.out.print("Pass - " + (i) + " : ");
           printArray(numbers);
        }
    }
   
    public static void printArray(Object[] array)
    {
        for(Object value : array)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void printHeader(String str, Object[] array)
    {
        System.out.println(str);
        for(int i=0; i<str.length();i++)
            System.out.print("=");
        System.out.println();
        System.out.print("Original : ");
        printArray(array);
    }
    
    public static void main(String[] args) 
    {
        String[] names = {"Garth", "Cher", "Pink", "Madonna", "Rihana", "Prince", "Adele"};
        printHeader("Selection Sort", names);
        selectionSort(names);
        
        System.out.println();
        
        Integer [] numbers = {20, 70, 40, 90, 10, 60, 30, 80, 50};
        printHeader("Insertion Sort", numbers);
        insertionSort(numbers);      
    }
}