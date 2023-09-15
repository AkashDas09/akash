class kohli 
{
	public static void main(String[] args) 
	{
		int x=1234;
		int rem=0;
		int rev=0;
		while(x>0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		System.out.println(rev);
	}
}
