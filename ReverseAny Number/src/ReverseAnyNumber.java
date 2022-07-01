import java.util.Scanner;
public class ReverseAnyNumber {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter any Number:");
		int num=obj.nextInt();
		int rev=0,rem;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of a given no is: "+rev);	
	}
}
