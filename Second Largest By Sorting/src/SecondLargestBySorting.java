
public class SecondLargestBySorting {

	public static void main(String[] args) {
		int[] a= {2,4,6,8,10,12,14,16,18,20};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.print(+a[1]);
	}

}
