
public class SelectioonSortNumber {

	public static void main(String[] args) {
	int[] a= {2,4,1,9,6,8,7};
	int min,temp;
	for(int i=0;i<a.length;i++)
	{		min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[min]>a[j])
			{
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	}
}
