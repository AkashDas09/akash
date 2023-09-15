import java.util.Scanner;
class sumnumber 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
			System.out.println(fact);
		
	}
}
