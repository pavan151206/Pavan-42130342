package bt;
import java.util.*;
public class admin extends bills {
	Scanner sc=new Scanner(System.in);
	boolean login(Map<String, String> admincre,List<String> usernames)
	{
		
		System.out.println("Enter Your Username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter Your password");
		String pass=sc.nextLine();
	
		if(admincre.containsKey(username))
		{
			if(admincre.get(username).equals(pass))
			{
				System.out.println("Login Successful!!");
				for(int i=0;i<5;i++)
				{
					System.out.print("                                  ");
					for(int j=0;j<32;j++)
					{
						if(i==0||i==4||j==0||j==31)
							System.out.print("*");
						else if(i==2)
						{
							System.out.print("  Welcome to Bus Booking App  *");
							break;
						}
						else
							 System.out.print(" ");
					}
					System.out.println();
				}
				while(true)
				{
					System.out.println("[1] Transactions");
					System.out.println("[2] Add Bus");
					System.out.println("[3] Display Customer name");
					System.out.println("[4] Display Buses");
					System.out.println("[5] Exit");
					int hh=sc.nextInt();
					if(hh==5)
					{
						System.out.println("Thank You Visit us again!!!");
						return false;
					}
					switch(hh)
					{
					case 1:
						transactions(usernames);
						System.out.println();
						break;
					case 2:
						add();
						System.out.println();
						break;
					case 3:
						usernames(usernames);
						System.out.println();
						break;
					case 4:
						display();
						System.out.println();
						break;
					}
				}
			}
			
		}
		else {
			System.out.println("There is no account with this username!!!");
			return true;
		}
		return false;
	}

	
	void registration(Map<String, String> admincre)
	{
		System.out.println("Please Enter your username");
		String ruser=sc.nextLine();
		System.out.println("Please Enter your password");
		String rpass=sc.nextLine();
		System.out.println("Registration Successful!!");
		admincre.put(ruser, rpass);
	}
}
	