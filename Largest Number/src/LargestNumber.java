
public class LargestNumber {

	public static void main(String[] args) {
		int[] a= {2,5,7,99,12,34,88};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.print("Largest Number is "+max);
	}

}
