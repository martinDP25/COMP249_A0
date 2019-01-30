import java.util.Scanner;
public class BookStore {

	public static void main(String[] args) {

		Scanner myKeys = new Scanner(System.in);
		int menuChoice, maxBooks, enterBooks, updateBooks, updateBooksMenu, updateMenuChoice=0, counter, bigCounter=0;
		final String password="password";
		String enterPass, title, author;
		long ISBN;
		double price;

		//Welcome message.
		System.out.println("Hello! Welcome to the bookstore management program.\n"
				+ "Within this program, you can enter new books, manage old ones,\n"
				+ "or simply view your inventory of books.\n"
				+ "Lets get started!\n \n"
				+ "How many books can your bookstore hold (Please enter the number in the program)?");

		//Prompts user to enter max number of books. Book objects
		//initialized based on users input.
		maxBooks=myKeys.nextInt();
		Book[] inventory= new Book[maxBooks];

		do {
			counter=0;
			//Main menu.
			System.out.println("\nWhat do you want to do?\n"
					+ "\t 1. \t Enter new books (Password required)\n"
					+ "\t 2. \t Change information of a book (Password required)\n"
					+ "\t 3. \t Display all books by a specific author\n"
					+ "\t 4. \t Display all books under a certain price\n"
					+ "\t 5. \t Quit\n"
					+ "Please enter your choice...");

			menuChoice=myKeys.nextInt();
			//***********If user selects choice 1 from menu.
			if(menuChoice==1)
			{
				do {
					counter++;
					bigCounter++;
					System.out.println("Please enter your password: ");
					enterPass=myKeys.next();
					if(bigCounter==12)
					{
						System.out.println("Program detected suspicous activities and will terminate immediately!");
						System.exit(0);
					}
					else if(counter==3)
					{
						break;
					}
					//Correct password is entered. This allows the user to continue with their work and enter the new books.
					else if(enterPass.equals(password))
					{
						System.out.println("Password accepted. How many books would you like to enter?");
						enterBooks=myKeys.nextInt();
						if(maxBooks>enterBooks)
						{
							for(int x=0; x<maxBooks; x++)
							{
								inventory[x]=new Book("", "", 0, 0);
								//System.out.println(inventory[x]);
								if(x==enterBooks-1)
								{
									break;
								}
							}
							System.out.println("Great, you have enough space in your inventory to enter your new books. \n"
									+ "Remaining Inventory: " + (maxBooks-enterBooks));
							break;
						}else if(maxBooks==enterBooks)
						{
							for(int x=0; x<maxBooks; x++)
							{
								inventory[x]=new Book("", "", 0, 0);
								//System.out.println(inventory[x]);
								if(x==enterBooks-1)
								{
									break;
								}
							}
							System.out.println("\nGreat, your inventory is now full!");
							break;
						}else if(maxBooks<enterBooks)
						{
							System.out.println("\nSorry, but you do not have enough space in your inventory to enter new books. \n"
									+ "Current Inventory: " + maxBooks + "\n"
									+ "Requested Inventory Entry: " + enterBooks + "\n");
						}
					}else if(enterPass!=password){
						System.out.println("Incorrect password. Please try again.");
					}
				}while(enterPass.equals(password)==false);

				//***********If user selects choice 2 from menu.
			}else if(menuChoice==2)
			{
				do {
					counter++;
					bigCounter++;
					System.out.println("Please enter your password: ");
					enterPass=myKeys.next();
					if(bigCounter==12)
					{
						System.out.println("Program detected suspicous activities and will terminate immediately!");
						System.exit(0);
					}
					else if(counter==3)
					{
						break;
					}
					//Correct password is entered. This allows the user to continue with their work and enter the new books.
					else if(enterPass.equals(password))
					{

						System.out.println("Which book would you like to update?");
						updateBooks=myKeys.nextInt();
						do {
							if(updateBooks>maxBooks || updateBooks-1<0)
							{
								System.out.println("Sorry, but this book number does not exist in our inventory. \n"
										+ "Enter 1 to return to main menu, or enter 2 to enter another book.");
								updateMenuChoice=myKeys.nextInt();
								
								if(updateMenuChoice==1)
								{
									break;
								}else if(updateMenuChoice==2)
								{
									continue; 
								}
							}else if(updateBooks>=0 && updateBooks<=maxBooks)
							{
								System.out.println("\nBook Number: " + updateBooks + "\nAuthor: " + inventory[updateBooks].author + "\nTitle: " + inventory[updateBooks].title + "\nISBN: " + inventory[updateBooks].ISBN + "\nPrice: $" + inventory[updateBooks].price + "\n"
										+ "\nWhat information would you like to change? \n"
										+ "\t 1. \t Author \n"
										+ "\t 2. \t Title \n"
										+ "\t 3. \t ISBN \n"
										+ "\t 4. \t Price \n"
										+ "\t 5. \t Quit \n");
								updateBooksMenu=myKeys.nextInt();
								if(updateBooksMenu==1)
								{
									System.out.println("Enter update Author information: ");
									do {
										author=myKeys.nextLine();
										inventory[updateBooks].setAuthor(author);
									}while(author.isEmpty());
								}else if(updateBooksMenu==2)
								{
									System.out.println("Enter update Title information: ");
									do {
										title=myKeys.nextLine();
										inventory[updateBooks].setTitle(title);
									}while(title.isEmpty());
								}else if(updateBooksMenu==3)
								{
									System.out.println("Enter update ISBN information: ");
									do {
										ISBN=myKeys.nextLong();
										inventory[updateBooks].setISBN(ISBN);
									}while(ISBN==0);
								}else if(updateBooksMenu==4)
								{
									System.out.println("Enter update Price information: ");
									do {
										price=myKeys.nextDouble();
										inventory[updateBooks].setPrice(price);
									}while(price==0);
								}else if(updateBooksMenu==5)
								{
									break;
								}
							}
						}while(updateMenuChoice<=5);

					}else if(enterPass!=password){
						System.out.println("Incorrect password. Please try again.");
					}
				}while(enterPass.equals(password)==false);
			}
			//***********If user selects choice 3 from menu.
			else if(menuChoice==3)
			{


			}
			//***********If user selects choice 4 from menu.
			else if(menuChoice==4)
			{

			}
			//***********If user selects choice 5 from menu.
			else if(menuChoice==5)
			{
				System.out.println("Goodbye, and have a nice day!");
				System.exit(0);
			}
		}while(bigCounter!=12);
	}

}