import java.util.Scanner;
class practicefibbonac 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a range");
		int x=s.nextInt();
		int a=1;
		int b=1;
		int c=1;
		for(int i=1;i<=x;i++)
		{
			a=b;
			b=c;
			c=a+b;
		
		System.out.println(a);
		}
	}
}
