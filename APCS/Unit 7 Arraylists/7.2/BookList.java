import java.util.*;

// Topic: ArrayList, Comparable
// Reference: AP A 2001 Question 2
// Difficulty: jajaja

public class BookList
{
	private ArrayList <Book> myList;
	// collection of books in sorted order as defined
	// by compareTo;  myList.length() > 0
	
	private Book temp;
	
	private int myCount;
	// number of books in myList
	
	public BookList()
	{
		myList = new ArrayList();
		
		myList.add(new Book("Madeline", "Bemelmans", 3, 8));
		myList.add(new Book("The Lorax", "Seuss", 3, 10));
		myList.add(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", 9, 99));
		myList.add(new Book("Holes", "Sacher", 12, 18));
		myList.add(new Book("I Know Why the Caged Bird Sings", "Angelou", 16, 99));
		
		
	}
	
	public void insertOne(Book bk)
	// precondition:  this BookList is in sorted order by age
	//                range as defined by compareTo;
	//                bk is not already in this BookList
	// postcondition: bk has been inserted into this BookList,
	//                maintaining its order by age range           
	{	
		myCount = myList.size();
		myList.add(0, bk);
		
		for(int i = 1; i < myCount; i++)
		{
			Book book = myList.get(i);
			if (book.compareTo(bk) == -1)
			{
				temp = myList.set(i, bk);
				myList.set(i-1, temp);
			}
		}
		
		myCount++;
	}
	
	public void insertMany(ArrayList <Book> second)
	// precondition:  this BookList is in sorted order by range
	//                as defined by compareTo; second contains
	//                second.length() books in arbitrary order;
	//                none of the books in second are in this
	//                BookList
	// postcondition: all the books from second have been inserted
	//                into this BookList, maintaining its order by
	//                age range
	{
		for(int i = 0; i < second.size(); i++)
		{
			Book books = second.get(i);
			insertOne(books);
		}
	}
	
	public String toString()
	{
		String str = "";
		for(int i=0; i < myList.size(); i++)
		{
			str +=myList.get(i) + "\n";
		}
		return str;
	}
}