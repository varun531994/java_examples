import java.util.Scanner;

public class Sum_of_digits
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int input;
		System.out.println("Enter the value to Calculate its sum:");
		input=in.nextInt();
		
		int sum =0;
		
		while(input !=0)
		{
			int lastdigit=input % 10;
			sum = sum + lastdigit;
			input = input/10;
		}
		
		System.out.println("Sum of its Digitd is:"+sum);
	}
}
