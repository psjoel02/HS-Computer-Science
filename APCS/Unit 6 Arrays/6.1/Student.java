public class Student
{
    // Instance Variables
    private String lastName;
    private String firstName;
    private int tardies;

    // Default Constructor
    public Student()
    {
        lastName="";
        firstName="";
        tardies=0;
    }

    // Second Constructor
    public Student(String l, String f, int t)
    {
        lastName = l;
        firstName = f;
        tardies = t;
    }

	// Mutator Methods
    public void setLastName(String l)
    {
        lastName = l;
    }

    public void setFirstName(String f)
    {
        firstName = f;
    }

    public void setTardies(int t)
    {
        tardies = t;
    }
    
    // Accessor Methods
    public String getLastName()
    {
        return lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public int getTardies()
    {
        return tardies;
    }

    

    // toString Method
    public String toString()
    {
        String str;
        str = lastName + ", " + firstName + " " + tardies;

        return str;
    }
}