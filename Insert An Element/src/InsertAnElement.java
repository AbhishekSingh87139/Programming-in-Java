
public class InsertAnElement {

	public static void main(String[] args) {
	int [] a= {10,20,30,40,50};
	int insert_element=25;
	int pos=3;
	for(int i=a.length-1;i>pos-1;i--)
	{
		a[i]=a[i-1];
		
	}
	a[pos-1]=insert_element;
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}

}
