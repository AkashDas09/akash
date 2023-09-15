import java.util.Scanner;
class ccc 
{
	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter a number");
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
		if(rev==k)
		{
		System.out.println("armstrong");
		}
else
		{
	System.out.println("not armstron");}
	}
}
