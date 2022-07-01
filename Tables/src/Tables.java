import java.util.Scanner;
public class Tables
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number which you want Table:");
		int a=obj.nextInt();
		
		for (int i=1;i<=10;++i)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}
	
	
		


