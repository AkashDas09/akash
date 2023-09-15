class N 
{
	public void m1()
	{
		System.out.println("moon");
	}
	public void m2()
	{
		System.out.println("earth");
	}
}
class U
{
	public static void m3()
	{
		N n=new N();
		n.m1();
		System.out.println("sky");
	}
	public static void m4()
	{
		N n=new N();
		n.m2();
        System.out.println("sun");
	}

	public static void main(String[] args) 
	{
		U u=new U();
		u.m4();
		u.m3();
		
	}
}

