//Joel Pimenta 1/13/2020
class JoelPimentaMoney
{


    // instance variable
    private String money;

    // constructor
    public JoelPimentaMoney(String m)
    {
        money = m;
    }

    // postcondition: returns the position of the first dot character
    //                in money or -1 if there is no dot in money
    private int findDot()
    {
    	char a = '.';

	    	for(int i = 0; i < money.length()-1; i++)
	    	{
	    		char ch = money.charAt(i);
		    	if(a == ch)
		    	{
		       		return ch;
		    	}

	    	}

    		return -1;


    }
    // precondition: money corresponds to a decimal number;
    //   i.e., it contains one of the following:
    //   (1) one or more digits
    //   (2) a dot followed by one or more digits, or
    //   (3) one or more digits followed by a dot,
    //       followed by zero or more digits
    public void printMoney()
    {


    	char a = '.';

    	if(findDot() == -1)
    	{

	    	for(int i = 0; i < money.length(); i++)
	    	{
	    		char ch = money.charAt(i);

		    	if(ch != a)
		    	{
		    		System.out.print(ch);
		    	}

	    	}

			System.out.println(" dollars and 0 cents");
    	}

    	if(findDot() != -1)
    	{

			for(int i = 0; i < money.length(); i++)
	    	{
	    		char ch = money.charAt(i);

		    	if(ch != a)
		    	{
		    		System.out.print(ch);
		    	}

		    	if((i == 0) && ch == a)
				{
					System.out.print("0");
				}

		    	if(ch == a)
		    	{
		    		System.out.print(" dollars and ");
		    	}

	    	}
	    	System.out.println(" cents");
    	}


    }







}