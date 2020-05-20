package finalcollections19;

public class CityMap 
{
	private String name;
	private double temp;
	
	public CityMap() 
	{
		
	}
	
	public CityMap(String name,double temp)
	{
		this.name = name;
		this.temp = temp;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getTemp()
	{
		return temp;
	}
	
	public void setTemp(double temp)
	{
		this.temp = temp;
	}
	
	@Override
	public String toString()
	{
		return this.name+"\t\t\t"+this.temp;
	}
	
}
