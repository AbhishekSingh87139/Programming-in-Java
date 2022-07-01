import java.util.Scanner;
public class Check
{ public static void main(String[] arug)

    {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter a Number:");
	int num=obj.nextInt();
	int temp=0;
	for(int i=2;i<=num-1;i++)
	{
	if(num%i==0)
	 { temp=temp+1;}
	}
	if(temp>0)
	{
	 System.out.print("Given Number is Not Prime ");
	}
	else
	{System.out.print("Given Number is Prime ");}
	
    }
}

