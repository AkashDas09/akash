import java.util.Scanner;
class buzznumber 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		if (x%10==7 && x%7==0)
		{
			System.out.println("buzz number");
		}
		else
			System.out.println("not buzznumber");
	}
}
