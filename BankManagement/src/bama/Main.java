package bama;
import java.util.*;
public class Main {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		boolean con=true,exist=false;
		Account ob=new Account();
		System.out.println("Welcome");
		while(con)
		{
		System.out.println("1.Create Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdrawl");
		System.out.println("4.Check Balance");
		System.out.println("5.History");
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			ob.createAccount();
			exist=true;
			sc.nextLine();
			break;
		case 2:
			if(exist)
			{
				System.out.println("Enter the password");
				String pass=sc.nextLine();
				if(pass.equals(ob.pass))
				{
			System.out.println("Enter the amount to be deposited");
			int amount=sc.nextInt();
			ob.deposit(amount);
				}
				else
					System.out.println("Incorrect Password");
			}
			else
			{
				System.out.println("Create an account first");
			}
			sc.nextLine();
			break;
		case 3:
			if(exist)
			{
				System.out.println("Enter the password");
				String pass=sc.nextLine();
				if(pass.equals(ob.pass)) {
			System.out.println("Enter the withdrawal amount");
			int amountwith=sc.nextInt();
			ob.withdrawl(amountwith);
				}
				else 
					
					System.out.println("Invalid Password");
			}else 
			{
				System.out.println("Create an account first");
			}
			sc.nextLine();
			break;
		case 4:
			if(exist)
			{
				System.out.println("Enter the password");
				String pass=sc.nextLine();
				if(pass.equals(ob.pass)) {
			ob.balance();
			}
				else
					System.out.println("Invalid Password");
			}
			else
			{
				System.out.println("Create an account first");
			}
			sc.nextLine();
			break;
		case 5:
			if(exist)
			{
				System.out.println("Enter the password");
				String pass=sc.nextLine();
				if(pass.equals(ob.pass)) {
			ob.his();
			}
			
			else 
				System.out.println("Invalid Password");
		}
			else
			{
				System.out.println("Create an account first");
			}
			sc.nextLine();
			break;
		default:
			System.out.println("Enter a valid input");
				
		}
		System.out.println("If you want to continue type Yes");
		String contin=sc.nextLine();
		if(contin.equals("Yes"))
			con=true;
		else
		{
			System.out.println("THANK YOU");
			con=false;
		}
		}
	}
}
