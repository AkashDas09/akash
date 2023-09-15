class England
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
		England a=new England();
		a.setname("oval");
		a.setid(178878);
		System.out.println(a.getname()+" "+a.getid());
		England b=new England();
		b.setname("london");
		b.setid(10998);
		System.out.println(b.getname()+" "+b.getid());
	}

}