package bs;
import java.util.*;
public class items {
	List<String> name=new ArrayList<>();
	List<Double> price=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	items()
	{
		name.add("Cream Biscuits");price.add(25.00);
		name.add("Color Pencils");price.add(32.00);
		name.add("Biscuits");price.add(20.00);
		name.add("White Paper");price.add(2.00);
		name.add("Color Paper");price.add(4.00);
		name.add("Pepsi");price.add(20.00);
		name.add("Milk");price.add(25.00);
		name.add("Pen");price.add(10.00);
		name.add("Diary Milk");price.add(25.00);
		name.add("Paste");price.add(15.00);
		name.add("Lays");price.add(25.00);
		name.add("Namkeens");price.add(25.00);
		name.add("NoteBook");price.add(30.00);
		
	}
	
	
	void display()
	{
		System.out.printf("%-20s  %-14s\n\n","Items","Prices");
		for(int i=0;i<name.size();i++)
		{
			System.out.printf("%-20s%-2s %-10s\n",name.get(i),"|",price.get(i));
		}
	}
	
	
}
