class perfect

{
	public static void main(String[] args)
	{
		int x=28;
		int sum=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==x)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}
	}

}