class harsad 
{
	public static void main(String[] args) 
	{
		int x=171;
		int sum=0;
		while(x>0)
		{
			int y=x%10;
			sum=sum+y;
			x=x/10;
		}
		if(sum%x==0)
		{
			System.out.println("harsad nnumber");
		}
		else
		{
			System.out.println("not harsad nummber");
		}

	}
}
