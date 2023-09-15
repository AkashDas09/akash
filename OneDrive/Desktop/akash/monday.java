 
 class monday 
{
	public static void main(String[] args) 
	{
		 
		int rem=0;
		int rev=0;
		int k=x;
		while(x>0)
		{
			rem=x%10;
			rev=rev+(rev*rev*rev);
			x=x/10;
		}
		if(k==rev)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}
}
