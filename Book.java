
public class Book {

	//Initializing Book values.
	String  title, author;
	long ISBN;
	double price;
	
	//Constructor for Book class.
	public Book(String t, String a, long id, double p)
	{
		title=t;
		author=a;
		ISBN=id;
		price=p;
	}
	
	//Method to display any book object values.
	public String toString()
	{
		return("The title of the book is " + title + ". \nThe author of the book is " + author + ". \nThe ISBN of the book is " + ISBN + ". \nThe price of the book is $" + price + ".");
	}
}
