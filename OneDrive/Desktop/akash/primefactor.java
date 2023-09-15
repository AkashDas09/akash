import java.util.Scanner;
class primefactor 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		for(int i=2;i<x;i++)
		{
			while(x%i==0)
			{
				x=x/i;	
			}
		}
		if(x>2)
			System.out.println(x);
	}
}
