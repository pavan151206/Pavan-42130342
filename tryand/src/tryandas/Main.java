package tryandas;

public class Main {
 String a;
 Main()
 {
	 a="I am inevitable";
 }
 Main get()
 {
	 return this;
 }
 void display()
 {
	 System.out.println(a);
 }
 public static void main(String []args)
 {
	 Main ob=new Main();
	 ob.get().display();
 }
}
