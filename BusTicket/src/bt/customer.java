package bt;
import java.util.*;
public class customer {
	bus on=new bus();
	Scanner sc=new Scanner(System.in);
	boolean login(Map<String, String> credentials)
	{
		
		System.out.println("Enter Your Username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter Your password");
		String pass=sc.nextLine();
	
		if(credentials.containsKey(username))
		{
			if(credentials.get(username).equals(pass))
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
				System.out.println("                                               Hello "+username);
				System.out.println("=========================================================================================================\n\n");
				
				bills og=new bills();
				while(true)
				{
					System.out.println("[1] Book a ticket");
					System.out.println("[2] Cancel ticket");
					System.out.println("[3] Exit");
					System.out.println("Enter your choice");
					int ch=sc.nextInt();
					if(ch==3)
					{
						og.bil(username,on.bbusno,on.bs);
						return false;
					}
					switch(ch)
					{
					case 1:
						
						on.display();
						System.out.println();
						on.book();
						System.out.println();
						break;
					case 2:
						og.bil(username,on.bbusno,on.bs);
						System.out.println();
						on.cancel();
						System.out.println();
					}
				}
			}
			else
			{
				System.out.println("Please Check your password");
			}
		}
		else
		{
			System.out.println("There is no account with this username!!!");
			return true;
		}
		return false;
	}
	
	
	void registration(Map<String,String> credentials)
	{
		
		System.out.println("Please Enter your username");
		
		String ruser=sc.nextLine();
		System.out.println("Please Enter your password");
		String rpass=sc.nextLine();
		System.out.println("Registration Successful!!");
		credentials.put(ruser, rpass);
	}
}
