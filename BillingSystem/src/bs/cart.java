package bs;
import java.util.*;
public class cart extends items{
	//Scanner sc=new Scanner(System.in);
//	ArrayList<String> cartitem=new ArrayList<>();
//	ArrayList<Integer> quantity =new ArrayList<>();
	void addd( ArrayList<String> cartitem, ArrayList<Integer> quantity)
	{
		System.out.println("Enter the Name of the item to be added");
		String newname=sc.nextLine();
		if(name.contains(newname))
		{
			cartitem.add(newname);
			System.out.println("Enter the quantity of the item");
			quantity.add(sc.nextInt());
		}
		else 
		{
			System.out.println("There is no such items in the shop");
		}
		
		
	}
	
	void remove(ArrayList<String> cartitem, ArrayList<Integer> quantity)
	{
		System.out.println("Items in the cart");
		System.out.println("===================================================================================================================");
		for(int i=0;i<cartitem.size();i++)
		{
			System.out.printf("%-20s%-10s\n",cartitem.get(i),quantity.get(i));
		}
		System.out.println("Enter the item name to removed");
		String itemremove = sc.nextLine();
		if(cartitem.contains(itemremove))
		{
			System.out.println("1.Remove entire quantity");
			System.out.println("2.Remove some quantity");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
				cartitem.remove(itemremove);
				break;
			case 2:
				int index=cartitem.indexOf(itemremove);
				int q=quantity.get(index);
				System.out.println("How many items you want to remove");
				int s=sc.nextInt();
				if(s>q)
				{
					System.out.println("There is not that many items");
				}
				else
				{
					int qua=q-s;
					quantity.remove(index);quantity.add(index,qua);
				}
				break;
			}
			
		}
		else
			System.out.println("There is no such item in the cart");
	}
	
	void displaycart(ArrayList<String> cartitem, ArrayList<Integer> quantity)
	{
		System.out.printf("%-20s %-14s\n","Items","Quantitiy");
		System.out.println("===========================================================================================================");
		for(int i=0;i<cartitem.size();i++)
		{
			System.out.printf("%-20s  %-18s\n",cartitem.get(i),quantity.get(i));
			//System.out.printf("%-20s%-2s %-10s\n",name.get(i),"|",price.get(i));

		}
	}
	
}
