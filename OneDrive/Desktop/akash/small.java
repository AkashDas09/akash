class small 
{
	public static void main(String[] args) 
	{
		int x=1;
		int y=2;
		int z=3;
		if(x>=y&&x>=z)
		{
			System.out.println("hii");
		}
		else if(z>=y&&y>=x)
		{
			System.out.println("3 is greater than 2");
		}
		else if(z>=x&&x<=y)
		{
			System.out.println("3 is greater than 1");
		}
		else if(z>=z&&z>=y)
		{
			System.out.println("3 is equal 3");
		}
		else
		{
			System.out.println("great");
		}
		
	}
}
