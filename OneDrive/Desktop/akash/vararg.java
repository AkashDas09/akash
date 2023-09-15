class vararg 
{
	public void m1(int...x) 
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
	    vararg a=new vararg();	
	    a.m1(10,91,9);
		a.m1(100,200,300);
	}
}
