 import java.util.Scanner;
class evenarray
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the size a number");
		int size=a.nextInt();
		
		int x[]=new int[size];
		System.out.println("Enter a element of array");
		for(int i=0;i<x.length;i++)
		{
			x[i]=a.nextInt();
		}
         for (int i=0;i<x.length;i++)
         {
         
			if (x[i]%2==0)		
			{
			System.out.println(i+" - even number");
			}
			else
		      System.out.println(i+" - not even number");
		}

	}
}

