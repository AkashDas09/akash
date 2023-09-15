class singlinheritance 
{
	int x=10;
	public static void m1()
	{
		System.out.println("hello");
	}
}
class doubleinheritance extends singlinheritance
{
	public static void m2()
	{
		System.out.println("hii");
	}
class mac
{

	public static void main(String[] args) 
	{
		singlinheritance a=new singlinheritance();
		a.m1();
		System.out.println(a.x);
	}
}
}
