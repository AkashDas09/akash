class duplicatearray 
{
	public static void main(String[] args) 
	{
		int []x={12,23,23,21,12,4,5,6,6,4,2156,76,54};
		for(int i=0;i<x.length;i++)
		{
			for(int  j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println(x[j]+"is a duplicate element");
				}
			}
			}

	}
}
