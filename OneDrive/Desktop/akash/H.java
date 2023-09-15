class H 
{
	public void m1()
	{
		System.out.println("good");
	}
}
class I extends H
{
	public void m1()
	{
		System.out.println("macallen");
	}




	public static void main(String[] args) 
	{
		H a=new I();
		a.m1();
	}
}

