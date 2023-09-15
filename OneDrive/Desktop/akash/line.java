class line 
{
	public static void main(String[] args) 
	{
		int x=50;
		int p=0;
		for(int i=5;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					p=p+i;
				}
			}
		}
		
		if(p==2)
		
			System.out.println(x);
		
		
	}
}
