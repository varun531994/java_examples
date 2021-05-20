import java.util.Scanner;

public class Odd_Even
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num;
		 System.out.println("Enter a number:");
		 num=in.nextInt();
		 
		 if(num%2==0)
		 {
			 System.out.println(num+":is Even");
		 }
		 else
		 {
			 System.out.println(num+":is odd");	
		 }
	}
}