import java.util.Scanner;
class EvenOdd
{
	public static void main (String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int a = obj.nextInt();
		
		if(a%2==0)
		{
			System.out.print("Number is even");
		}
		else
		{
		
			System.out.print("Number is odd");
		}
		
	}
}