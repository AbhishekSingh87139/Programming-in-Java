import java.util.Scanner;
public class Grade
{
	
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.print("first Subject=");
	int a=obj.nextInt();
	System.out.print("second Subject=");
	int b=obj.nextInt();
	System.out.print("third Subject=");
	int c=obj.nextInt();
	float d=(a+b+c)/300f;
	float p=d*100f;
	if(p>=90&&p<=100)
	{System.out.print("Grade A");}
	if(p>=80&&p<90)
	{System.out.print("Grade B");}
	if(p>=60&&p<80)
	{System.out.print("Grade C");}
	if(p<60)
	{System.out.print("Grade D");}
}}
