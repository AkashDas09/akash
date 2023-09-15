import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int count=0;
		int temp=x;
		while(x>0)
		{
			x=x/10;
			count++;
		}
		x=temp;
		int sum=0;
		while(x>0)
		{
			int last=x%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*last;
			}
			sum=sum+prod;
			x=x/10;
		}
		if(sum==temp)
		{
			System.out.println("armstrong nummber");
		}
		else
		{
			System.out.println("not armstrong");
		}
			}
}
