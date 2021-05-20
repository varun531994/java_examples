import java.util.Scanner;

public class Odd_Even_Array
{  
public static void main(String args[])
{  
int a[]={123,113,1314,1214,145};  
System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++)
{  
if(a[i]%2!=0)
{  
System.out.println(a[i]);  
}  
}  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++)
{  
if(a[i]%2==0)
{  
System.out.println(a[i]);  
}  
}  
}
}