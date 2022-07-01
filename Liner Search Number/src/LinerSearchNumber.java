import java.util.Scanner;
public class LinerSearchNumber {
public static void main(String[] args)
{ Scanner obj=new Scanner(System.in);
System.out.print("Enter the value you want to search: ");
int a=obj.nextInt();
int arr[]= {5,3,6,1,2};
int temp=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==a)
	{
		System.out.print("element is found at "+i+" index position");
		temp=temp+1;
	}
	
}
if(temp==0)
{
	System.out.print("element is Not found");
}
	

	}

}
