import java.util.Scanner;
class magicnumber 
{
	public static void main(String[] args) 
	{
	   Scanner a= new Scanner (System.in);
	   System.out.println("Enter a number");
	   int x=a.nextInt();
	   if(x%9==1)
		{
		   System.out.println("magic number");
		}
		   else
		{
			   System.out.println("not magic number");
		}

	}
}
