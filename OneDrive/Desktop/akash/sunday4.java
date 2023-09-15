class Sunday4 
{
	public static void main(String[] args) 
	{
		int n=90;int i;int count=0;int j;
		for(i=1;i<=90;i++)
		{
			if(n%i==0)
				System.out.print(i+" o");

		}
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==2)
			System.out.println(j+" ");
	}
}
