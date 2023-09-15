interface starr
{	
	void m1();
}
interface warr
{
	void m1();
}
abstract class moon implements starr,warr
{
    public void m1()
	{
		System.out.println("macallen");
	}
    public int m1()
	{
		System.out.println("blue level");
		return 6;
	}
	public static void main(String[] args) 
	{
		moon a=new moon();
		a.m1();
		a.m1(6);
      
	}
}
