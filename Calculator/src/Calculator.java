import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter the vale of First Number:");
			int a=obj.nextInt();
			System.out.print("Enter the vale of Second Number:");
			int b=obj.nextInt();
			System.out.print("Select the Symbol(+,-,*,/):");
			String sym=obj.next();
			int c;
			switch(sym)
			{
		    	case "+":c=a+b;
		    	System.out.print("Addition of a and b is="+c);
		    	break;
		    	case "-":c=a-b;
		    	System.out.print("Subtraction of a and b is="+c);
		    	break;
		    	case "*":c=a*b;
		    	System.out.print("Multiplication of a and b is="+c);
		    	break;
		    	case"/":c=a/b;
		    	System.out.print("Division of a and b is="+c);
		    	break;
		    	default:System.out.print("Invalid Symbol");
		    	break;
	    }
	    
	   
}
	}	   
		
	    
	      
	  
	    
	


