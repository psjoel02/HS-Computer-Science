import java.util.*;

public class RectangleManager
{
   // instance variables
   private MyRectangle rect;
   MyRectangle myrectangle = new MyRectangle();
   public Scanner keyboard;

   public RectangleManager()
   {
      keyboard = new Scanner(System.in);
   }



   public void inputDimensions()
   {
   	Scanner keyboard = new Scanner(System.in);

   	System.out.println("Enter Length -->");
   	int len = keyboard.nextInt();
    System.out.println("Enter Width -->");
    int wid = keyboard.nextInt();
    rect = new MyRectangle(len,wid);


   }

   public void changeDimensions()
   {
   	System.out.println("Enter Length -->");
   	int length = keyboard.nextInt();
    myrectangle.setLength(length);
    System.out.println("Enter Width -->");
   	int width = keyboard.nextInt();
    myrectangle.setWidth(width);


   }

   public void print()
   {
     System.out.println(rect);

   }

   public static void main(String[] args)
   {
       RectangleManager app = new RectangleManager();

       System.out.println("*************************************");
       System.out.println("  Test Constructor and Input Method");
       System.out.println("*************************************");
       app.inputDimensions();
       app.print();

       System.out.println("************************");
       System.out.println("  Test Mutator Method");
       System.out.println("************************");
       app.changeDimensions();
       app.print();
   }
}