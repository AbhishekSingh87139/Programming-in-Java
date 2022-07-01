import java.util.Scanner;
public class EqualNum
{
 public static void main(String arg[])
 {
	 Scanner obj = new Scanner(System.in);
	 System.out.print("Enter the first Number: ");
	 int a=obj.nextInt();
	 System.out.print("Enter the Second Number: ");
	 int b=obj.nextInt();
	 if(a==b)
	 {
		 System.out.print("Both the Number are EQUAL "); 
	 }
	 else
	 {
		 System.out.print("Both the number Are Not EQUAL");
	 }
 }
}
