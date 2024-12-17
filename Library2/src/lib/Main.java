package lib;
import java.util.*;
public class Main {
	
	public static void main(String []args)
	{
		String Amail="abc@",Apass="12345";boolean con=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Admin");
		System.out.println("2.Student");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			Admin ob=new Admin();
			if(Amail.equals(ob.mail)&&Apass.equals(ob.pass))
			{
				while(con)
				{
				System.out.println("1.Add");
				System.out.println("2.Remove");
				System.out.println("3.Check");/////
				int choice =sc.nextInt();
				sc.nextLine();
				{
				switch(choice)
				{
				case 1:
					ob.add();
					break;
				case 2:
					ob.remove();
					break;
				case 3:
					ob.available();
					break;
				default:
					System.out.println("Enter a valid input");
					
				}
			    System.out.println("You want to continue : Yes or No");
			    String cont=sc.nextLine();
			    if(cont.equals("Yes"))
			    	con=true;
			    else 
			    	con=false;
				}
			}
			}
			else
				System.out.println("Invaid mail or password, Try Again");
			break;
		case 2:
			Student ob1=new Student();
			con=true;
			while(con)
			{
			System.out.println("1.Available Books");
			System.out.println("2.Display Particular");
			System.out.println("3.Check Out");
			System.out.println("4.Return");
			int choices=sc.nextInt();
			sc.nextLine();
			
			
				switch(choices)
				{
				case 1:
					ob1.dispall();
					break;
				case 2:
					ob1.dispparticular();
					break;
				case 3:
					ob1.dispall();
					ob1.checkout();
					ob1.display();
					break;
				case 4:
					ob1.returning();
					ob1.display1();
					break;
				default:
					System.out.println("Enter a valid input");
				}
				System.out.println("If you want to continue type Yes");
				String conti=sc.nextLine();
				if(conti.equals("Yes"))
					con=true;
				else
					con=false;
			}
			break;
		default:
			System.out.println("Enter a valid input");
		}
	}

}