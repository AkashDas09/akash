class world1 
{
	int x=10;
	public static void m()
	{
		System.out.println("Akash das");
	}

class world2 extends world1
{

	public static void m3()
	{
		System.out.println("Soraj das");
	}


	public static void main(String[] args) 
	{
		world1 a=new world1();
		a.m();
		System.out.println(a.x);
	}
}
}

