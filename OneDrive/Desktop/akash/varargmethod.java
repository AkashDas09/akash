class A 
{
}
class B extends A
{
}
class test
{
	public void m1(A a)
	{
		System.out.println("nice");
	}

	public void m1(B b)
	{
		System.out.println("great job");
	}
	public void m1(Object q)
	{
		System.out.println("grand final");
	}
	public static void main(String[] args)
	{
		B a1=new B();
		test a=new test();
		a.m1(c1);
	}
}
