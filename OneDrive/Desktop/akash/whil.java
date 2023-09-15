
class whil 
{
	public static void main(String[] args) 
	{
	int x=1;
	while(x<=17)
		{
		int y=1;
		int num=0;
		while(y<=x)
			{
			if(x%y==0)
			num++;
			y++;
			}
			if (num==2)
				System.out.println(x+"is a prime");
			x++;
		}
	}
			
			
	
}
