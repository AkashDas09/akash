class T 
{
	public void m1()
	{
		T t=new T();
		t.m2();
		System.out.println("bye");
	}
	public void m2() 
	{
		T t=new T();
		t.m3();
		System.out.println("Hello");
	}
	public void m3()
	{
		T t=new T();
		t.m1();
		System.out.println("macallen");
	}
}
class sam
{

	public static void main(String[] args)
	{
		T s=new T();
		s.m2();
	}
}

