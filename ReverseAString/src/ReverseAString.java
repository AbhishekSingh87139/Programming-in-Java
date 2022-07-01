import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Name");
		String name=obj.nextLine();
		int leng=name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
		   rev=rev+name.charAt(i);
		}System.out.println("Reverse "+name+"is:"+rev);
	}

}
