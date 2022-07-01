import java.util.Scanner;
public class GreatInThree 
{
	
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.print("first Number=");
	int a=obj.nextInt();
	System.out.print("second Number=");
	int b=obj.nextInt();
	System.out.print("third Number=");
	int c=obj.nextInt();
	if (a>b)
	{
		if (a>c)
		{ System.out.print("Greater Number is"+a);}
		else
		{ System.out.print("Greater Number is"+c);}
	}
		else
		{
			if(b>c)
			{ System.out.print("Greater Number is"+b);}
			else 
			{ System.out.print("Greater Number is"+c);}
		}
	}}	
				
		
		
	
	
	

