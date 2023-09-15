class strongn 
{
	public static void main(String[] args) 
	{
		int x=145;
		int rem=0;
		int sum=0;
		int k=x;
		while(x>0)
		{
			rem=x%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			x=x/10;
		}
		if(sum==k)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not Strong number");
		}


	}
}
