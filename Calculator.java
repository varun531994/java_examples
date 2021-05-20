import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double x,y,z;
		int a,b;
		
	
		
		do {
		System.out.println("Enter the value of x:");
		x=in.nextDouble();
		System.out.println("Enter the value of y:");
		y=in.nextDouble();
		System.out.println("Enter value of b:");
		b=in.nextInt();
		System.out.println("1add\n2sub\n3mul\n4div");
		System.out.println("Enter the value of a:");
		a=in.nextInt();
		
			
		if(a == 1)
		{
			z=x+y;
			System.out.println("The sum is:"+z);
		}
		
		else if(a == 2)
		{
			z=x-y;
			System.out.println("The diffrence is:"+z);
		}
		
		else if(a==3)
		{
			z=x*y;
			System.out.println("The multiplication is:"+z);
		}
		
		else
		{ 
	      z=x/y;
		  System.out.println("The division is:"+z);
		}
		}
		while (b == 1);
	}
}
			
	
	
		
		