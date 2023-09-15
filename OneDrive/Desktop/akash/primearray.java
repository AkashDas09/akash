import java.util.Scanner;
class primearray 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=a.nextInt();
		int x[]=new int[size];
		System.out.println("Enter the element of the array");
		
		for(int i=0;i<x.length;i++)
		{
			x[i]=a.nextInt();
		}
		int num=0;
		for (int i=0;i<x.length;i++)
		{
			if(x[size]%i==0)
				num++;
		}
		if(num==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}
