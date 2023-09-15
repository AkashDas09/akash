 abstract class finall 
{
    int x=1928;
	abstract void m1();
	
	}

class kindll extends finall
{
	void m1()
	{
		System.out.println("macallen");
	}
	public static void main(String[] args) 
	{
		kindll a=new kindll();
		a.m1();
		System.out.println(a.x);
	}
}

