package finalCollections11;

import java.util.Comparator;

public class Mobile implements Comparable<Mobile>,Comparator<Mobile>
{
	private String name;
	private double price;
	private int ram;
	
	public Mobile() 
	{
		
	}
	public Mobile(String name,double price, int ram)
	{
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
	
	@Override
	public String ToString()
	{
		return this.name+"\t\t"+this.price+"\t\t"+this.ram;
	}
	
	@Override
	public int compareTo(Mobile m)
	{
		//DSO based on id
		/*Integer i1 = this.ram;
		Integer i2 = m.ram;
		return i1.compareTo(i2);*/
		
		//DSO based on price
		Double d1 = this.price;
		Double d2 = m.price;
		return d1.compareTo(d2);
		
		//DSO based on name
		/*String n1 = this.name;
		String n2 = m.name;
		return n1.compareTo(n2);*/
	}
	
	@Override
	public int compare(Mobile m1, Mobile m2)
	{
		//CSO based on ram
		/*Integer i1 = m1.ram;
		Integer i2 = m2.ram;
		return i2.compareTo(i1);*/
		
		//CSO based on price
		Double d1 = m1.price;
		Double d2 = m2.price;
		return d2.compareTo(d1);
		
		//CSO based on name
		/*String n1 = m1.name;
		String n2 = m2.name;
		return n2.compareTo(n1);*/
	}

}
