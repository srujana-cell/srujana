package finalCollections;

import java.util.Comparator;

public class Pen implements Comparator<Pen>
{
	private String name;
	private String type;
	private int price;
	
	public Pen(String name,String type,int price)
	{
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return this.name+"\t\t"+this.type+"\t\t"+this.price;
	}
	
	@Override
	public int compare(Pen p1,Pen p2)
	{
		Integer i1 = p1.price;
		Integer i2 = p2.price;
		return i2.compareTo(i1);
	}
	
}


