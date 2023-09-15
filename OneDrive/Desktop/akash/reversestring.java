class reversestring 
{
	public static void main(String[] args) 
	{
		String name="hello man";
		String reversed=" ";
		System.out.println("original:"  +name);
		for(int i=0;i<name.length();i++)
		{
			reversed=name.charAt(i)+reversed;
		}
		System.out.println("reversed:" +reversed);
	}
}
