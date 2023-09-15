import java.util.Scanner;
class sunday2 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		for(int i=1;i<=10;i++)
		{		
		System.out.println(x+" * "+i+" = "+x*i);
		}
	}
}
