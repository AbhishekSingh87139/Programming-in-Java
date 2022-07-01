import java.util.Scanner;
public class SwapWT
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.print("first:");
	int a=obj.nextInt();
	System.out.print("second:");
	int b=obj.nextInt();
	System.out.println("Before Swap");
	System.out.print("first:"+a);
	System.out.println(" , second:"+b);
	a=a-b;
	b=a+b;
	a=b-a;
	System.out.println("After Swap");
	System.out.print("first:"+a);
	System.out.print(" , second:"+b);
	}
}

