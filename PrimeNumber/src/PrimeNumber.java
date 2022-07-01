import java.util.Scanner;
public class PrimeNumber
{

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=obj.nextInt();
		int temp=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
				
			{
				temp=temp+1;
			}
		}
	if(temp==0)
	{System.out.println(num+"  is a Prime number");}
	
	else
	{System.out.println(num+"  is a Not Prime number");}
}} 
