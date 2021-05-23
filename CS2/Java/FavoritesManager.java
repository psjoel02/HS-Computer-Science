import java.util.*;

public class FavoritesManager
{
private Favorites myFavorites;
   //instance variables

   // methods
   public void inputFavorites()
   {
Scanner keyboard = new Scanner(System.in);

System.out.print("Name:");
String name = keyboard.nextLine();
System.out.print("Food:");
String food = keyboard.nextLine();
System.out.print("Color:");
String color = keyboard.nextLine();
System.out.print("Music:");
String music = keyboard.nextLine();
System.out.print("Automobile:");
String auto = keyboard.nextLine();
System.out.print("Sport:");
String sport = keyboard.nextLine();
myFavorites = new Favorites(name, food, color, music, auto, sport);
   }

   public void printFavorites()
   {
   System.out.println();
   System.out.println(myFavorites);
   }

   public static void main(String[] args)
   {
       FavoritesManager app = new FavoritesManager();
       app.inputFavorites();
       app.printFavorites();
   }
}