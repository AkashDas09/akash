import java.util.Scanner;
class calculator 
{
	static int x;
	static int y;
	public static void main(String[] args) 
	{
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a first number");
		x=a.nextInt();
		System.out.println("Enter a second number");
		y=a.nextInt();
		
		switch('-')
		{
			case'+':
				System.out.println("the addition is:"+(x+y));
			break;
			case'-':
				System.out.println("the substraction is:"+(x-y));
			break;
			case'*':
				System.out.println("the multipication"+(x*y));
			break;
			case'/':
				System.out.println("the division is:"+(x/y));
			break;
			case'%':
				System.out.println("the modul is:"+(x%y));
			break;
			default:
				System.out.println("the default value is:");
			break;

		}
	}
}
