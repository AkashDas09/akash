import java.util.Scanner;
class array2 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=a.nextInt();
		int []x=new int[size];
		System.out.println("Enter the element of an array");
		for (int i=0;i<x.length;i++)
		{
			x[i]=a.nextInt();
		}
		System.out.println("Enter the given array");
		for (int i=0;i<x.length;i++)
		{
			int num=0;
			for (int j=1;j<=x[i];j++)
			{
				if(x[i]%j==0)
					num++;
			}
		
			if(num==2)
			{
				System.out.println(x[i]+"is prime");
			}
			else
			{
				System.out.println(x[i]+"not prime");
			}
		}
	}
}
