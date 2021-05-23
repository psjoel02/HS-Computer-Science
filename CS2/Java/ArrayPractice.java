import java.util.*;

public class ArrayPractice
{
    public void method1()
    {
      int[]array1 = new int[5];

      array1[0] = 2;
      array1[1] = 4;
      array1[2] = 6;
      array1[3] = 8;
      array1[4] = 10;

      System.out.println(array1[0]);
      System.out.println(array1[1]);
      System.out.println(array1[2]);
      System.out.println(array1[3]);
      System.out.println(array1[4]);
      System.out.println();

      for(int i = 0; i < 5; i++)
		{
   			System.out.println(array1[i]);
		}

    }

    public void method2()
    {
      int[]array2 = new int[6];

      array2[0] = 1;
      array2[1] = 3;
      array2[2] = 5;
      array2[3] = 7;
      array2[4] = 9;
      array2[5] = 11;
      System.out.println();
      System.out.println(array2[0]);
      System.out.println(array2[1]);
      System.out.println(array2[2]);
      System.out.println(array2[3]);
      System.out.println(array2[4]);
      System.out.println(array2[5]);
      System.out.println();

      for(int i = 0; i < 6; i++)
		{
   			System.out.println(array2[i]);
		}


    }

    public void method3()
    {
      double[]array3 = new double[4];

      array3[0] = 3.14159;
      array3[1] = 98.6;
      array3[2] = 8.75;
      array3[3] = 0.625;
      System.out.println();
      System.out.println(array3[0]);
      System.out.println(array3[1]);
      System.out.println(array3[2]);
      System.out.println(array3[3]);
      System.out.println();

      for(int i = 0; i < 4; i++)
		{
   			System.out.println(array3[i]);

   		 }
    }
    public void method4()
    {
      double[]array4 = new double[3];

      array4[0] = 1.2;
      array4[1] = 2.3;
      array4[2] = 3.4;
      System.out.println();
      System.out.println(array4[0] + " ");
      System.out.println(array4[1] + " ");
      System.out.println(array4[2] + " ");
      System.out.println();

       for(int i = 0; i < 3; i++)
		{
   			System.out.println(array4[i]);

   		 }
    }
    public void method5()
    {
    	String[] array5 = new String[6];

    	array5[0] = "red";
    	array5[1] = "white";
    	array5[2] = "blue";
    	array5[3] = "green";
    	array5[4] = "yellow";
    	array5[5] = "orange";
        System.out.println();
    	System.out.println(array5[0]);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		System.out.println(array5[3]);
		System.out.println(array5[4]);
		System.out.println(array5[5]);
		System.out.println();

		for(int i = 0; i < 6; i++)
		{
    		System.out.println(array5[i]);
		}



    }
    public void method6()
    {
    	String[] array6 = new String[5];

    	array6[0] = "Texas";
    	array6[1] = "Oklahoma";
    	array6[2] = "Louisiana";
    	array6[3] = "Arkansas";
    	array6[4] = "New Mexico";
		System.out.println();
        System.out.println(array6[0]);
		System.out.println(array6[1]);
		System.out.println(array6[2]);
		System.out.println(array6[3]);
		System.out.println(array6[4]);
		System.out.println();

    	for(int i = 0; i < 5; i++)
		{
    		System.out.println(array6[i]);
		}








    }

    public static void main(String[] args)
    {
       ArrayPractice app = new ArrayPractice();

       app.method1();
       app.method2();
       app.method3();
       app.method4();
       app.method5();
       app.method6();
    }
}