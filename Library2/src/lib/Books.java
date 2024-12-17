package lib;
import java.util.*;
public class Books {
	LinkedList<String> books=new LinkedList<>();
	Books()
	{
		books.add("Midnight Library");
		books.add("The Silent Patient");
		books.add("The Da Vinci");
		books.add("Harry Potter");
	}
	void books()
	{
		
		int b=books.size();
		for(int i=0;i<b;i++)
		{
			System.out.println(books.get(i));
		}
	}
		
}
