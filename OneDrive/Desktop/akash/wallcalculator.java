import java.util.Scanner;
class wallcalculator 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=a.nextInt();
		System.out.println("Enter a second number");
		int y=a.nextInt();
		System.out.println("choose a operator(+,-,*,/,%)");
		char c=a.next().charAt(0);
		if( c=='+'|| c=='-'|| c=='*'|| c=='/'|| c=='%')
		
		switch (c)
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
		case'%':
			System.out.println("the modul is:"+(x%y));
		break;
		case'/':
            System.out.println("the division is:"+(x/y));
		break;
		default:
			System.out.println("ok");
		break;
		}
	}
}
