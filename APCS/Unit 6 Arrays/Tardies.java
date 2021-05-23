import java.util.*;

public class Tardies
{
    // instance variables
    private Student[] students;    // list of students
    private int numStudents;       // logical size of the array

    // constructor
    public Tardies()
    {
        students = new Student[50];   // instantiate array
        numStudents = 0;
    }

    /** precondition: none
     *  postcondition: students array has been populated with
     *     Student objects from keyboard input. numStudents has
     *     been updated to reflect the logical size of the
     *     array student.
     */
    public void enterData()
    {
    	Student app = new Student();
    	Scanner scan = new Scanner(System.in);
		String ans = "y";
		
    	while(ans.equals("y"))
    	{

    	System.out.println("==================");
    	System.out.println("Enter Student Data");
    	System.out.println("==================");

    	System.out.print("Enter last name --> ");
    	String lname = scan.nextLine();
    	app.setLastName(lname);
		
    	System.out.print("Enter first name --> ");
    	String fname = scan.nextLine();
    	app.setFirstName(fname);

    	System.out.print("Enter number of tardies --> ");
    	int tardy = scan.nextInt();
    	app.setTardies(tardy);
    	
    	students[numStudents] = new Student(app.getLastName(), app.getFirstName(), app.getTardies());
    
		numStudents++;
		scan.nextLine();
		System.out.println();
		
		System.out.print("Enter another student[y/n]? ");
		ans = scan.nextLine();
		
		System.out.println();

    	}
    	
    }

    /* @return the total number of tardies for all students
     *    in the class.
     */
    public int getTotalTardies()
    {
  		int total = 0;
  		for(int i = 0; i < numStudents; i++)
  		{
  		Student student = students[i];
  		total += student.getTardies();
  		}
  		return total;
		
    }

    /** precondition: none
     *  postcondition: a summary report has been printed which includes
     *     the total number of tardies for the entire class and a
     *     list of names and tardies for every student in the class.
     */
    public void summaryReport()
    {
    	
		
		System.out.println("==================================");
		System.out.println("Class Summary - Tardy Total = " + getTotalTardies());
		System.out.println("==================================");
		System.out.println();
		for(int i = 0; i < numStudents; i++)
		{
		Student student = students[i];
		System.out.println(student);
		}
    }

    public static void main(String[] args)
    {
        Tardies app = new Tardies();
        app.enterData();
        app.summaryReport();
    }
}