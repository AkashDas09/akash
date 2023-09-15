class countword 
{
	public static void main(String[] args) 
	{
		String word="this is a self motivated persion";
		int count=word.split("\\s").length;
		System.out.println(count);
	}
}
