package bt;
import java.util.*;
public class bills extends bus{
	void bil(String name,List<Integer> bbusno,List<Integer> bs)
	{
		if(bbusno.isEmpty())
		{
			System.out.println("Thank You..Visit us again");
		}
		else
		{
			int sum=0;
			int billno=1011;
			System.out.println("                    Thank You!! Have a Safe and Happy Journey");
			System.out.println("********************************************************************************");
			System.out.println("      Bill NO:"+billno+"           Tours && Travels                 2025-12-15");
			System.out.println("********************************************************************************");
			System.out.println("Name :"+name);
			System.out.printf("%-10s%-12s%-30s%-30s\n","Bus no","Bus name","Seats","Total Price");
			for(int i=0;i<bs.size();i++)
			{
				sum+=bs.get(i)*price.get(bbusno.get(i));
				System.out.printf("%-10s%-12s%-30s%-30s\n",busno.get(bbusno.get(i)),busname.get(bbusno.get(i)),bs.get(i),bs.get(i)*price.get(bbusno.get(i)));
			}
			System.out.printf("%-52s%-10s\n","",sum);
			System.out.println("********************************************************************************");
		}
	}
	
	void transactions(List<String> usernames)
	{
		System.out.println(usernames);
		System.out.println("****************************************************************");
		System.out.printf("%-10s%-12s%-30s%-30s\n","Bus no","Username","Seats","Total Price");
//		for(int i=0;i<usernames.size();i++)
//		{
//			System.out.printf("%-10s%-12s%-30s%-30s\n",busno.get(bbusno.get(i)),usernames.get(i),bs.get(i),bs.get(i)*price.get(bbusno.get(i)));
//		}
		System.out.println("****************************************************************");
	}
	
	void usernames(List<String>usernames)
	{
		System.out.println("Usernames Using the App");
		System.out.println("------------------------------------------------------------------");
		for(int i=0;i<usernames.size();i++)
		{
			System.out.println(usernames.get(i));
		}
		
	}
}
