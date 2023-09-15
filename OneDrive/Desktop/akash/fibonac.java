import java.util.Scanner;
class fibonac 
{
	public static void main(String[] args) 
	{
        Scanner sca=new Scanner(System.in);
		System.out.println("Enter a range number");
		int x=sca.nextInt();
		int a=1,b=1,c=1;
		for (int i=1;i<=x;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		

		}
	}
}
