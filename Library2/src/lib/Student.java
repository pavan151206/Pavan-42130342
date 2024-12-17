package lib;
import java.util.*;
public class Student extends Books{
	String partname;String name,wanted,issued,returned;int id;
	Scanner sc=new Scanner(System.in);
	Student()
	{
		System.out.println("Enter the Name");
		name=sc.nextLine();
		System.out.println("Enter the ID");
		id=sc.nextInt();
	}
	void dispall()
	{
		books();
	}
	void dispparticular()
	{
		sc.nextLine();
		System.out.println("Enter the book to be checked");
		partname=sc.nextLine();
		if(books.contains(partname))
			System.out.println("Yes the book is available");
		else
			System.out.println("No the book is not available");
	}
	void checkout()
	{
		sc.nextLine();
		System.out.println("What's the book name");
		wanted=sc.nextLine();
		issued=wanted;
		books.remove(wanted);
	}
	void display()
	{
		System.out.println("Student Name :"+name);
		System.out.println("Student ID :"+id);
		System.out.println("Book checkedout :"+issued);
		
	}
	void returning()
	{
		sc.next();
		System.out.println("Enter the book name to be returned");
		returned=sc.nextLine();
		books.add(returned);
	}
	void display1()
	{
		System.out.println("Student Name :"+name);
		System.out.println("Student ID :"+id);
		System.out.println("Book returned :"+returned);

	}
}