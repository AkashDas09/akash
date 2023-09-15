class  neon

{
	public static void main(String[] args) 
	{
		int x=9;
		int squr=x*x;
		int sum=0;
		int rem=0;
		while(squr>0)
		{
			rem=squr%10;
			sum=sum+rem;
			squr=squr/10;
		}

		if(sum==x)
		System.out.println("neonn number");
		else
			System.out.println("not neonn number");
	}

}
