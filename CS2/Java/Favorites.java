public class Favorites
{
private String name;	   // The peron's name
private String food;       // Favorite food
private String color;      // Favorite color
private String music;      // Favorite music
private String automobile; // Favorite automobile
private String sport;      // Favorite sport
   // instance variables
   public Favorites (String name, String food, String color, String music, String automobile, String sport)
   {
   	this.name = name;
   	this.food = food;
   	this.color = color;
   	this.music = music;
   	this.automobile = automobile;
   	this.sport = sport;
   }
   // constructors
public String toString()
{
	return"Name        : " + name + "\n" +
          "Food        : " + food + "\n" +
          "Color       : " + color + "\n" +
          "Music       : " + music + "\n" +
          "Automobile  : " + automobile + "\n" +
          "Sport       : " + sport;
}
   // toString method

}