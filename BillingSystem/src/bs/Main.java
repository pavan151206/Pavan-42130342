package bs;
import java.util.*;
public class Main {
	public static void main(String[]args)
	{
		ArrayList<String> cartitem=new ArrayList<>();
		ArrayList<Integer> quantity =new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("|--------------------------------------------------------------------------------------------------------------|");
		System.out.println("|--------------------------------------------------------------------------------------------------------------|");
		System.out.println("                             ==== Welcome To the Shop Billing System ====                                        ");
		System.out.println();
		
		System.out.println("Enter Your Name ");
		String custname=sc.nextLine();
		System.out.println("Enter Your Phone Number ");
		String phone=sc.nextLine();
		
		items ob=new items();
		ob.display();
		System.out.println();
		while(true)
		{
			System.out.println("1.Add Items");
			System.out.println("2.Remove Items");
			System.out.println("3.Show Items in the cart");
			System.out.println("4.Show all items");
			System.out.println("0.Exit");
			System.out.println("Enter your choice :");
			cart it=new cart();
			int choice=sc.nextInt();
			
			if(choice ==0)
			{
				billl bi =new billl();
				System.out.println();
				System.out.println();
				System.out.println();
				bi.dispbilll(cartitem, quantity, custname, phone, it.price, it.name);
				break;
			}
			switch(choice)
			{
			case 1:
				it.addd(cartitem,quantity);
				System.out.println();
				break;
			case 2:
				it.remove(cartitem,quantity);
				System.out.println();
				break;
			case 3:
				it.displaycart(cartitem,quantity);
				System.out.println();
				break;
			case 4:
				it.display();
				System.out.println();
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
