public class State
{
private String name;      // The state's name
private String bird;      // The state's bird
private String flower;    // The state's flower
private String song;      // The state's song
private String motto;     // The state's motto
private String tree;      // The state's tree
   // instance variables
public State()
{
	name = "";
	bird = "";
	flower = "";
	song  = "";
	motto = "";
	tree = "";
}
public State(String n, String b, String f, String s, String m, String t)
{
	name = n;
	bird = b;
	flower = f;
	song  = s;
	motto = m;
	tree = t;
}

   // constructors
   public String toString()
{
   return "State Name   : " + name + "\n" +
          "State Bird   : " + bird + "\n" +
          "State Flower : " + flower + "\n" +
          "State Song   : " + song + "\n" +
          "State Motto  : " + motto + "\n" +
          "State Tree   : " + tree;
}
   // toString method

}