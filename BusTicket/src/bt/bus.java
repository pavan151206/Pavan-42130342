package bt;
import java.util.*;
public class bus {
	Scanner sc=new Scanner(System.in);
	List<Integer> busno =new ArrayList<>();
	List<String> busname= new ArrayList<>();
	List<String> bussor=new ArrayList<>();
	List<String> destiny=new ArrayList<>();
	List<Integer> price=new ArrayList<>();
	List<Integer>seats=new ArrayList<>();
	Map<Integer,Integer>booked=new HashMap<>();
	List<Integer>bbusno=new ArrayList<>();
	List<Integer>bs=new ArrayList<>();
	bus()
	{
		int min=0,max=100;
		Random random=new Random();
		busno.add(1024);busname.add("Paradise");bussor.add("Chennai");destiny.add("Goa");price.add(1400);seats.add(random.nextInt(max-min+1)+min);
		busno.add(1045);busname.add("Volvo Exp");bussor.add("Chennai");destiny.add("Bangalore");price.add(700);seats.add(random.nextInt(max-min+1)+min);
		busno.add(1452);busname.add("Imperis");bussor.add("Chennai");destiny.add("Punjab");price.add(400);seats.add(random.nextInt(max-min+1)+min);
		busno.add(1111);busname.add("Dreamland");bussor.add("Chennai");destiny.add("Noida");price.add(450);seats.add(random.nextInt(max-min+1)+min);
		busno.add(1456);busname.add("Quantum");bussor.add("Chennai");destiny.add("Mathura");price.add(900);seats.add(random.nextInt(max-min+1)+min);
	}
	
	void display()
	{
		System.out.println("x-----------------------------------------------------------------------------------------------------------x");
		System.out.println("|                                         Available Buses                                                   |");
		System.out.println("x-----------------------------------------------------------------------------------------------------------x");
		System.out.printf("|  %-10s%-12s%-30s%-12s%-20s%-12s%-5s    |\n", "No","Bus no","Bus name","Source","Destiny","Price","Seats");
		for(int i=1;i<=busno.size();i++)
		{
			System.out.printf("|  %-10s%-12s%-30s%-12s%-20s%-12s%-5s    |\n", i,busno.get(i-1),busname.get(i-1),bussor.get(i-1),destiny.get(i-1),price.get(i-1),seats.get(i-1));
		}
		System.out.println("x-----------------------------------------------------------------------------------------------------------x");
	}
	
	void book()
	{
		System.out.println("Enter the bus number you want to book");
		int n=sc.nextInt();
		if(n>busno.size())
		{
			System.out.println("There is no bus with that number!!!!");
			
		}
		System.out.println("Enter the number of tickets");
		int no=sc.nextInt();
		if(no>seats.get(n-1))
		{
			System.out.println("There is not much tickets in this bus");
			
		}
		else
		{
			System.out.println("Ticket Booked Successfully!!!");
			int g=seats.remove(n-1);
			seats.add(n-1,g-no);
			bbusno.add(n-1);
			bs.add(no);
		}
	}
	
	void cancel()
	{
		System.out.println("Enter the bus no to cancel the ticket");
	    int cn=sc.nextInt();
	    System.out.println("1.Cancel all tickets");
	    System.out.println("2.Cancel some tickets");
	    int u=sc.nextInt();
	    switch(u)
	    {
	    case 1:
	    	bbusno.remove(cn-1);
	    	bs.remove(cn-1);
	    	System.out.println();
	    	break;
	    case 2:
	    	System.out.println("How many tickets to cancel");
	    	int h=sc.nextInt();
	    	int gh=bs.remove(cn-1);
	    	bs.add(cn-1,gh-h);
	    	System.out.println();
	    	break;
	    }
	    System.out.println("Ticket Cancellation Successfull!!!");
	}
	
	void add()
	{
		
		System.out.println("Enter bus name");
		busname.add(sc.nextLine());
		System.out.println("Enter bus no.");
		int nnn=sc.nextInt();
		busno.add(nnn);
		sc.nextLine();
		System.out.println("Enter bus source");
		bussor.add(sc.nextLine());
		System.out.println("Enter the destiny");
		destiny.add(sc.nextLine());
		System.out.println("Enter the price");
		price.add(sc.nextInt());
		System.out.println("Enter available seats");
		seats.add(sc.nextInt());
		System.out.println("Details of the bus added successfully");
	}
}
