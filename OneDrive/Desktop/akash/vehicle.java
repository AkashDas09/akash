class vehiclee 
{
	String brand="Audi";
	public void small() 
	{
		System.out.println("bhud,bhud!");
	}
}
class car extends vehiclee

{
	String name="R8";
	public void big()
	{
		System.out.println("gun,gun!");
	}
}
class c
{

	public static void main(String[]args)
	{
		car a=new car();
		a.small();
		System.out.println(a.brand+" "+a.name);
	}
}
