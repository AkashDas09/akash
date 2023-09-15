import java.util.Scanner;
class paod 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		System.out.println("Enter a range number");
		int y=a.nextInt();
		int count=1;
		for(int i=x;i<=x;i++)
		{
			if(x%2!=0)
				count++;
		}
		if(count!=2)
			System.out.println(x);
	}
}
