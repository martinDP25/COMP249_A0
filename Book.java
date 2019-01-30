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
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public long getISBN()
	{
		return ISBN;
	}
	
	public void setISBN(long ISBN)
	{
		this.ISBN=ISBN;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public static int findNumberOfCreatedBooks()
	{
		
		return 0;
	}
	
	public boolean equals()
	{
		return false;
		
	}
	
	//Method to display any book object values.
	public String toString()
	{
		return("\nAuthor: " + author + ". \nTitle: " + title + ". \nISBN: " + ISBN + ". \nPrice: " + price + ".");
	}
}