import java.util.Scanner;
class reversenumber 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		int rem=0;
		int rev=0;
		for (int i=1;i<=x;i++)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		System.out.println(rev);
	}
}
