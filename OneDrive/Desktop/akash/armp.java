import java.util.Scanner;
class armp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number!");
		int x=sc.nextInt();
		int temp=x;
		int count=0;
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
			System.out.println("armstrong");
		}
		else System.out.println("not armstrong");
	}
}
