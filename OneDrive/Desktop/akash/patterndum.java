import java.util.Scanner;
class paterndum 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		for(int i=0;i<=x;i++)
		{
			for(int j=0;j<=x;j++)
			{
				if(i<=j&&i+j<=x-1||i>=j&&i+j>=x-1)
					System.out.print("x");
				else
					System.out.print("");
			}
			System.out.println();
		}

	}
}
