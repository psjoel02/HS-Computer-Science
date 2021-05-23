
public class HelloWorldTwo
{
	private String x;
	
	public HelloWorldTwo(String n)
	{
		 x = n;
	}
	
	public String toString()
	{
		return x;
	}
	public static void main(String[] args)
	{
		HelloWorldTwo HW = new HelloWorldTwo("Hello World");
		
		System.out.println(HW);
	}
}