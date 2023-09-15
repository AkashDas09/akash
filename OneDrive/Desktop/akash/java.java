import java.util.Scanner;
class java 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Entera number");
		int x=a.nextInt();
		int rem=0;
		int rev=0;
		int k=x;
		while(x>0)
		{
			rem=x%10;
			rev=rev+(rem*rem*rem);
            x=x/10;
		}
		if (rev==k)
		{
		System.out.println("arm");
		}
		else
		{
			System.out.println(" nnot arm");
		}
			
	}
}

