import java.util.Scanner;
class wall 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		System.out.println("Enter a second number");
		int y=a.nextInt();
		switch ('*')
		{
		case '+':
		System.out.println("the addition is:"+(x+y));
		break;
		case'-':
			System.out.println("the substraction is:"+(x-y));
		break;
		case'*':
			System.out.println("the multipication:"+(x*y));
		break;
		default:
			System.out.println("ok");
		break;
		}
	}
}
