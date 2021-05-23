public class MyRectangle
{
private int length;     // rectangle's length
private int width;      // rectangle's width
public int perimeter;
public int area;
   // instance variables
   public MyRectangle()
   {

   }
   public MyRectangle(int len, int wid)
   {
   	this.length = len;
   	this.width = wid;

   }
   // constructor
   public int getLength()
   {
   	return length;
   }
   public int getWidth()
   {
   	return width;
   }
   // accessor methods
   public void setLength(int l)
{
   length = l;
}
public void setWidth(int w)
{
   width = w;
}
   // mutator methods
   public int getPerimeter()
   {
   	return perimeter = ((2 * length)+(2 * width));
   }
   public int getArea()
   {
   	 return area = (length * width);
   }
   // other methods
public String toString()
{
return    "Length = " + length + "\n" +
          "Width =    " + width + "\n" +
          "Perimeter = " + getPerimeter() + "\n" +
          "Area = " + getArea();
}
}