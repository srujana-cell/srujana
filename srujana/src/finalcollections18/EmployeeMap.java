package finalcollections18;

public class EmployeeMap 
{
	private int id;
	private String name;
	
	public EmployeeMap()
	{
		
	}
	
	public EmployeeMap(Integer id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.id+"\t\t\t"+this.name;
	}
	
}
	
	


