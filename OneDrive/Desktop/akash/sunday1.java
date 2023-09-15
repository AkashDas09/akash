import java.util.Scanner;
class sunday1 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
