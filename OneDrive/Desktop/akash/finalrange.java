import java.util.Scanner;
class finalrange 
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
	    int i=1;
	    while(i<=x)
		{
			int j=1;
			int num=0;
			while(j<=i)
			{
				if(i%j==0)
					num++;
				j++;
			}
			if(num==2)
				System.out.println(i+"is prime number");
			i++;
		}
}
}
