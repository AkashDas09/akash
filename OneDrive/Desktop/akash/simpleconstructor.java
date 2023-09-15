class simpleconstructor 
{
	static
	{
		System.out.println("soraj");
	}
	simpleconstructor()
	{
		System.out.println("constructor");	
	}
	{
		System.out.println("macallen");
	}
	void simpleconstructor()
	{
		new simpleconstructor();
		System.out.println("akash");
	}
	public static void main(String[] args) 
	{
		new simpleconstructor().simpleconstructor();
		
	}
}
