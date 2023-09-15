import java.util.Scanner;
class arrayreverse 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=a.nextInt();
		int []x=new int[size];
		System.out.println("Enter the Element of an array");
		for (int i=0;i<x.length;i++)
		{
			x[i]=a.nextInt();
		}
		System.out.println("Enter the given array");
		for (int i=size-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}
}
