import java.util.Scanner;
public class BinarySearchNumber {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter the value that we want search:");
		int item=obj.nextInt();
		int [] a= {2,5,7,9,12,14,16,17,19,20,24,28};
		int li=0; int hi=a.length;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
			if(a[mi]==item)
			{
				System.out.print("item is present at "+mi+" index position");
				break;
			}
			else if(a[mi]<item)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	if(li>hi)
	{
		System.out.print("item is not found");
	}

	}

}
