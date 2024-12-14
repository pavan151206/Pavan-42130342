package tryandas;
import java.util.*;
public class st {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();String s1;
		int l=s.length();
		char c='\0';int v=0;
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				c=s.charAt(i+1);
			}
		}
		
		s=s.replaceAll(String.valueOf(c),"");
		int l1=s.length();
		System.out.println(l1-1);
	}
}
