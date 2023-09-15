import java.util.Scanner;
class fight 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		int num=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				num++;
			}
		}
		if(num==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
