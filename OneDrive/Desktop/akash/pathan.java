import java.util.Scanner;
class pathan 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
        System.out.println("Enter a number");
		int x=a.nextInt();
		int rem=0;
		int rev=0;
		int r=x;
		int r=0;
		while(x>0)
		{
			rem=x%10;
			rev=rev+(r*r*r);
			x=x/10;
		}
		if(r==rev)
		{
			System.out.println("arm");
		}
		else
			System.out.println("not ");
		
	}				
}
