package bt;
import java.util.*;
public class Main {
	public static void main(String[]args)
	{
		customer ob=new customer();
		Map<String,String> credentials = new HashMap<>();
		Map<String,String> admincre=new HashMap<>();
		
		boolean f=true;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Admin");
			System.out.println("2.Customer");
			System.out.println("3.Exit");
			int c=sc.nextInt();
			
			f=true;
			if(c==3)
			{
				System.out.println("Thank You....Visit us again");
				break;
			}
			
				switch(c)
				{
				case 2:
					
					while(f)
					{
						System.out.println("                   -:-:-:-:-: Welcome to Tours && Travels :-:-:-:-:-\n\n   ");
						
						for(int i=0;i<7;i++)
						{
							System.out.print("                                 ");
							for(int j=0;j<22;j++)
							{
								if(i==0||i==6||j==0||j==21)
									System.out.print("*");
								else if(i==2)
								{
									System.out.print("     1:Log in       *");
									break;
								}
								else if(i==3)
								{
									System.out.print("     2:Register     *");
									break;
								}
								else if(i==4)
								{
									System.out.print("     3:Exit         *");
									break;
								}
								else
									 System.out.print(" ");
							}
							System.out.println();
						}
						
						System.out.print("                                  Enter Your Choice: ");
						int choice =sc.nextInt();
						
							if(choice==3)
							{
								System.out.println("Thank You!! Visit us again");
								f=false;
								break;
							}
							switch(choice)
							{
							case 1:
								f=ob.login(credentials);
								System.out.println();
								break;
							case 2:
								
								ob.registration(credentials);
								System.out.println();
								break;
							default:
								System.out.println("Invalid Choice");
							}
					}
				case 1:
					admin of= new admin();
				
					while(f)
					{
						System.out.println("                   -:-:-:-:-: Welcome to Tours && Travels :-:-:-:-:-\n\n   ");
						
						for(int i=0;i<7;i++)
						{
							System.out.print("                                 ");
							for(int j=0;j<22;j++)
							{
								if(i==0||i==6||j==0||j==21)
									System.out.print("*");
								else if(i==2)
								{
									System.out.print("     1:Log in       *");
									break;
								}
								else if(i==3)
								{
									System.out.print("     2:Register     *");
									break;
								}
								else if(i==4)
								{
									System.out.print("     3:Exit         *");
									break;
								}
								else
									 System.out.print(" ");
							}
							System.out.println();
						}
						
						System.out.print("                                  Enter Your Choice: ");
						int choice =sc.nextInt();
						if(choice==3)
						{
							System.out.println("Thank You!! Visit us again");
							f=false;
							break;
						}
						switch(choice)
						{
						case 1:
							List<String> usernames=new ArrayList<>(credentials.keySet());
							f=of.login(admincre,usernames);
							break;
						case 2:
							of.registration(admincre);
							break;
						}
					}
				}
			
		}
		
		
	}
}
