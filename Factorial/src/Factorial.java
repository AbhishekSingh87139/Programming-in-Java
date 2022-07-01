import java.util.Scanner;
public class Factorial 
{public static void main(String[] args) 
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Ehter any Number");
	int a=obj.nextInt();
	int b;b=1;
	for(int i=1;i<=a;i++)
	{ 
		b=b*i;
		
	}System.out.println("Factorial is :"+b);

	}

}
