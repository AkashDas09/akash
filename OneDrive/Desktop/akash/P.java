class P 
{
	public int m1(int x,int y)
	{
		System.out.println(x*y);
		return x*y;
	}
}
class Q extends P
{
	public int m1(int g,int h)
	{
	return g+h;	
	}

	public static void main(String[] args) 
	{
		P a=new P();
		a.m1(3,4);
		System.out.println(a.m1(2,3));
	}
}
