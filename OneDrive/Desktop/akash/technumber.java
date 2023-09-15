class technumber 
{
	public static void main(String[] args) 
	{
		int x=2025;
		int sum=0;
		int squr=0;
		int k=x;
		while(x>0)
		{
			int y=x%10;
			sum=sum+y;
			squr=squr*y;
		}
		if (k==2)
		{
			System.out.println("tech");

		}
		else
		{
           System.out.println(" not tech");
		}
	}
}
