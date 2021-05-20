import java.util.Scanner;

public class Ascending_order
{
	public static void main(String args[])
	{
		int n,tmp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		System.out.println("Ascending order is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
		}
	}
}