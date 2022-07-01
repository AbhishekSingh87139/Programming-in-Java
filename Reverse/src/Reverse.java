import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Three digit Number");
		int a=obj.nextInt();
		int d1,d2,d3;
		d1=a%10;
		a=a/10;
		d2=a%10;
		d3=a/10;
		int rev=100*d1+10*d2+d3;
		System.out.println("Reverse is "+rev);
		
	}

}
