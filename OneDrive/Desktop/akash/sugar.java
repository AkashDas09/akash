class sugar 
{
	public static void main(String[] args) 
	{
		int i=1;
		while(i<=10)
		{
			int j=1;
			int num=0;
			while(j<=i)
			{
				if(i%j==0)
					num++;
				j++;
			}
			if(num==2)
				System.out.println(i+"is prime number");
			i++;
		}
	}
}
