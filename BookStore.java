import java.util.Scanner;
public class BookStore {

	public static void main(String[] args) {

		Scanner myKeys = new Scanner(System.in);
		int menuChoice, maxBooks, enterBooks;
		final String realPass="comp249";
		String enterPass;
		
		//Welcome message.
		System.out.println("Hello! Welcome to the bookstore management program.\n"
				+ "Within this program, you can enter new books, manage old ones,\n"
				+ "or simply view your inventory of books.\n"
				+ "Lets get started!\n \n"
				+ "How many books can your bookstore hold (Please enter the number in the program).?");
		
		//Prompts user to enter max number of books. Book objects
		//initialized based on users input.
		maxBooks=myKeys.nextInt();
		Book[] inventory= new Book[maxBooks];
		
		//Main menu.
		System.out.println("What do you want to do?\n"
				+ "\t 1. \t Enter new books (Password required)\n"
				+ "\t 2. \t Change information of a book (Password required)\n"
				+ "\t 3. \t Display all books by a specific author\n"
				+ "\t 4. \t Display all books under a certain price\n"
				+ "\t 5. \t Quit\n"
				+ "Please enter your choice...");
		
		menuChoice=myKeys.nextInt();
		if(menuChoice==1)
		{
			System.out.println("Please enter your password: ");
			enterPass=myKeys.next();
			
			if(enterPass.equals(realPass))
			{
				System.out.println("Password accepted. How many books would you like to enter?");
				enterBooks=myKeys.nextInt();
				for(int x=0; x<maxBooks; x++)
				{
					inventory[x]=new Book("", "", 0, 0);
					System.out.println(inventory[x]);
				}
			}else if(enterPass!=realPass){
				System.out.println("Incorrect password. Please try again.");
			}
			
		}else if(menuChoice==2)
		{
			
		}else if(menuChoice==3)
		{
			
		}else if(menuChoice==4)
		{
			
		}else if(menuChoice==5)
		{
			System.out.println("Goodbye, and have a nice day!");
			System.exit(0);
		}
		
	}

}
