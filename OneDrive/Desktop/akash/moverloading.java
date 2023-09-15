class moverloading 
{
	public void m1(Object z) 
	{
		System.out.println("macallan");
	}
	
	public static void main(String[] args)
	{
		moverloading a=new moverloading();
		
		a.m1(1.1);
		a.m1(0);
		a.m1( new String());
		a.m1("abc");
		a.m1('a');
		a.m1(10.2f);
		a.m1(1234567890);
		a.m1(null);
		a.m1(true);
		

	}
}
