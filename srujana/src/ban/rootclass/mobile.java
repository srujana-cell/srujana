package ban.rootclass;

public class mobile 
{
	String name;
	double price;
	int RAM;
	
	public mobile(String name,double price,int RAM)
	{
		this.name = name;
		this.price = price;
		this.RAM = RAM;
	}
	
	@override
	public String toString()
	{
		return "name = "+this.name+"price = "+this.price+"RAM = "+RAM;
	}
	
	@override
	public boolean  equals (Object Obj)
	{
		mobile m = (mobile) Obj;
		return this.name.equals(m.name)&& this.price == m.price&& this.RAM == m.RAM;
	}
	
	@override
	public int hashCode()
	{
		return (int) (this.RAM);
	}
	

}
