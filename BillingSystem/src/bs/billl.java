package bs;
import java.util.*;
public class billl {
	void dispbilll(ArrayList<String> cartitem, ArrayList<Integer> quantity,String cusname, String phone,List<Double> price,List<String> name)
	{
		if(cartitem.isEmpty())
		{
			System.out.println("Thank You!! See You Again");
		}
		else
		{
			double sum=0.0;
			System.out.println("Thank You for Shopping With us");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			System.out.println("Bill to - "+cusname);
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-25s%-10s%-8s%-20s\n","Item Name","Quantity","Rate","Total Price");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			for(int i=0;i<cartitem.size();i++)
			{
				sum+=quantity.get(i)*price.get(name.indexOf(cartitem.get(i)));
				System.out.printf("%-25s%-10s%-8s%-20s\n",cartitem.get(i),quantity.get(i),price.get(name.indexOf(cartitem.get(i))),quantity.get(i)*price.get(name.indexOf(cartitem.get(i))));
			}
			System.out.printf("%-43s%s\n", "Total Amount ","Rs "+sum);
			double gst=sum*18/100;
			double finala=sum+gst;
			System.out.printf("%-43s%s\n","GST","Rs "+gst);
			System.out.printf("%-43s%s\n","Final Amount","Rs "+finala);
			
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
	}
}
