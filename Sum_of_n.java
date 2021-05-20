import java.util.Scanner;

public class Sum_of_n
{
	public static void main(String[] args)
	{
		int n;
		int tmp = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of n:");
		n = in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			tmp = tmp + i;
		}
		System.out.println("The sum till n Numbers is:"+tmp);
	}
}