import java.util.Scanner;

public class Leap_year
{
	public static void main(String[]args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year:");
		year=sc.nextInt();
		
		if((year %400 ==0)||(year % 100 != 0 && year % 4 == 0))
		{
			System.out.println(year+":is a Leap Year");
		}
		else 
		{
			System.out.println(year+":is not a Leap Year");
		}
		
	}
}