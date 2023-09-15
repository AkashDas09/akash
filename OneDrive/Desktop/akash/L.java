class L 
{
	public static void m1()
	{
		System.out.println("moon");
	}
	public static void m2()
	{
		System.out.println("earth");
	}
}
class V //extends L
{
	public void m3()
	{
		L.m1();
		System.out.println("sky");
	}
	public void m4()
	{
		L.m2();
        System.out.println("sun");
	}

	public static void main(String[] args) 
	{
		V v=new V();
		v.m4();
		v.m3();
		//v.m1();//moon
		//v.m2();//earth
		
	}
}
