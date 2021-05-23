import java.util.*;

public class AssignmentManager
{
   // instance variables
   private Assignment rect;
   public Scanner keyboard;
   Assignment assignment = new Assignment();

   public AssignmentManager()
   {
      keyboard = new Scanner(System.in);
   }
   public void def()
   {

   	String typ = " ";
   	String nam = " ";
   	int sco = 0;
   	System.out.println("Type:");
   	System.out.println("Name:");
   	System.out.println("Score:" + sco);
   	rect = new Assignment(typ,nam,sco);
   }

   public void inp()
   {
   	Scanner keyboard = new Scanner(System.in);

	System.out.print("Type:");
   	String typ = keyboard.nextLine();

	System.out.print("Name:");
    String nam = keyboard.nextLine();

    System.out.print("Score:");
    int sco = keyboard.nextInt();

    rect = new Assignment(typ,nam,sco);


   }

   public void cha()
   {

Scanner keyboard = new Scanner(System.in);

	System.out.println("It came in here cha");

	System.out.print("Type:");
   	String type = keyboard.nextLine();
   	assignment.setType(type);

	System.out.print("Name:");
    String name = keyboard.nextLine();
    assignment.setName(name);

    System.out.print("Score:");
    int score = keyboard.nextInt();
	assignment.setScore(score);
    assignment.toString();

   }

   public void print()
   {


     System.out.println(rect);

   }

   public static void main(String[] args)
   {
       AssignmentManager app = new AssignmentManager();

       System.out.println("***********************************************");
       System.out.println("  Test Default Constructor and Accessor Methods");
       System.out.println("***********************************************");
       app.def();
       app.print();

       System.out.println("*******************************************");
       System.out.println("  Test 2nd Constructor and Accessor Methods");
       System.out.println("*******************************************");
       app.inp();
       app.print();


       System.out.println("*******************************************");
       System.out.println("  Test Mutator and Accessor Methods        ");
       System.out.println("*******************************************");
       app.cha();


   }
}