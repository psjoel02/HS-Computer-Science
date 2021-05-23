public class Assignment
{
	private String type;
	private String name;
	private int score;



   // instance variables
   public Assignment()
	{
      type = "";
      name = "";
      score = 0;
	}
	public Assignment(String t, String n, int s)
	{
		type = t;
		name = n;
		score = s;
	}

   // constructors

public String getType()
{
	return type;
}

   public String getName()
{
	return name;

}

public int getScore()
{
	return score;
}
   // Mutator methods

 public void setType(String t)
   {
   	type = t;
	}
   public void setName(String n)
   {
   	name = n;
	}

 public void setScore(int s)
   {


   	score = s;

	}


   public String getLettergrade()
   {


if (score >= 90 && score <=100 )
{

    return("A");
}

if (score >= 80 && score <=89 )
{

	return("B");
}

if (score >= 70 && score <=79 )
{

	return("C");
}

if (score >= 60 && score <=69 )
{

	return("D");
}
if (score <60 )
{
	return("F");
}
else
{
	return "";
}

   }

public String toString()
{

	return "Letter Grade: " + getLettergrade();
}
   }

   // other methods


