import java.util.Scanner;
public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Any Number:");
		int num=obj.nextInt();
		int b=num;
		int count =0;
		while(b>0)
		{
			count=count +1;
			b=b/10;
		}
		
		b=num;int sum=0; 
		while(b>0)
		{
			int pro=1;
			int digit =b%10;
			for(int i=1;i<=count;i++)
			pro=pro*digit;
		    sum=sum+pro;
		    b=b/10;
		}
	if(sum==num)	
	{
		System.out.print(num+ " Given Number is Armstrong Number");
	}
	else 
	{
		System.out.print(num+ " Given Number is NOT Armstrong Number");	
	}
	}

}
