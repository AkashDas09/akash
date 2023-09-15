class vi 
{
	public static void m1() 
	{ 
		vi a=new vi();
		a.m3();
		System.out.println("macallen");
	}

	public static void m2()
	{
		vi b=new vi();
		b.m4();
		System.out.println("god");
	}
	public void m3()
	{
		vi.m2();
		System.out.println("great");
	}
	public void m4()
	{
		vi.m1();
		System.out.println("grand");
	}
public static void main(String[] args)
	{
	pi a=new pi();
	a.m3();
	a.m4();
	}
}
