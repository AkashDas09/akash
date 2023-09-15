class hiding 
{
	public static void m1()
	{
		System.out.println("tree");
	}
	public static void m2()
	{
		System.out.println("pond");
	}
}
class biding extends hiding
{
    public static void m1()
	{
		System.out.println("trehe");
	}
	public static void m2()
	{
		System.out.println("ponnd");
	}

	public static void main(String[] args) 
	{
		biding a=new biding();
		a.m1();
		hiding c=new hiding();
		c.m1();
	}
}
