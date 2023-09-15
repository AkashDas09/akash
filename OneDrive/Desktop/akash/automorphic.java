import java.util.Scanner;
class automorphic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int sqr=x*x;
		int temp=x;
		int prod=1;
		while(x>0)
		{
			x=x/10;
			prod=prod*10;
		}
		if(temp==(sqr%prod))
		{
			System.out.println("automorhic number");
		}
		else
		{
			System.out.println("not automorphic");
		}
	}
}
