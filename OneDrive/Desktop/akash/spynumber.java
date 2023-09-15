class spynumber
{
	public static void main(String[] args) 
	{
		int x=123;
		
		 int product=0;
		 int sum=0;
		while(x>0)
		{
			int y=x%10;
			sum=sum+y;
			product=product*sum;
			x=x/10;
		}
		if(sum==product)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not spyy nummber");
		}

	}
}
