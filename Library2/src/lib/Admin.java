package lib;
import java.util.*;
public class Admin extends Books {
	String pass,mail,bookname;
	Scanner sc=new Scanner(System.in);
	Admin()
	{
		System.out.println("Enter the mail id");
		mail=sc.nextLine();
		System.out.println("Enter the password");
		pass=sc.nextLine();
	}
	void add()
	{
		System.out.println("Enter the name of the book to be added");
		bookname=sc.nextLine();
		books.addLast(bookname);
		System.out.println("The particular book has been added");
	}
	void available()
	{
		books();
	}
	void remove()
	{
		books();
		System.out.println("Enter the name of the books to be removed");
		String removebook=sc.nextLine();
		books.remove(removebook);
	}
}