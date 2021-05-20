import java.util.Scanner;

public class Number_Triangle
{
	public static void main(String[] args)
	{
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num:");
		num=in.nextInt();
		
		for(int i =1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{System.out.print(""+i+"");
		
			}
System.out.print("\n");
		}
	}
}	
	