class Encapsulationprac 
{
	private String name;
	private int id;
	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
    public void setname(String name1)
	{
		name=name1;
	}
    public void setid(int id1)
	{
		id=id1;
	}
	public static void main(String[] args) 
	{
		Encapsulationprac a=new Encapsulationprac();
		a.setname("akash");
		a.setid(1919);
		System.out.println(a.getname()+" "+a.getid());
        Encapsulationprac b=new Encapsulationprac();
		b.setname("soraj");
		b.setid(10010);
        System.out.println(b.getname()+" "+b.getid());
	}
}
