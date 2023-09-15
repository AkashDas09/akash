import java.util.Scanner;
class draw 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				if(i<=j)
				System.out.print("* ");
				
				else
					System.out.print(" ");
					
			}
		
			System.out.println();
		}
		for(int k=0;k<x;k++)
		{
			for(int l=0;l<x;l++)
			{
				if(k<=l)
					System.out.println("* ");
				else
					System.out.println(" ");
			}
		}
	}
}
