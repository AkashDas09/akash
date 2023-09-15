class nonstaticblock 
{
	int x=10;
	{
		this.m1();
	}
	public void m1()
	{
		System.out.println(y);
	}
	public static void main(String[] args)
	{
        nonstaticblock a=new nonstaticblock();
		System.out.println(a.y);
        System.out.println(a.x);
	}
	int y=100;


}
