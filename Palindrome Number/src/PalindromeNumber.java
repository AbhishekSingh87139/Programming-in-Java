import java.util.Scanner;
public class PalindromeNumber 
{	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Any Number: ");
		int num=obj.nextInt();
		int temp=num;
		int rev=0,rem;
		while (num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
	if(temp==rev)
		{
			System.out.print(" Given Number is Palindrome Number"+temp);
		}
	else 
		{
		System.out.print(" Given Number is Palindrome NOT Number"+temp);
		}
	
	}

}
