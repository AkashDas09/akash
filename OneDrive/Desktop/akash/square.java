import java.util.Scanner;
class square 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		for(int i=0;i<=x/2;i++)
		{
			for(int j=0;j<=x/2;j++)
			{
		        if(i==j||i+j==x-1||j==x/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
