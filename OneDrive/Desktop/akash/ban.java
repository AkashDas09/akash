class ban 
{
	public static void m1(int...x)
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
		m1(10,399,500);
		m1(50,400,633);
	}
}
