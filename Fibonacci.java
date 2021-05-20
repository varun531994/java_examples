import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int num;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter num:");
		num=in.nextInt();
		
		int f1,f2=0,f3=1;
		
		for(int i=1;i<=num;i++)
		{
			
			System.out.println(f3+"");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}
}