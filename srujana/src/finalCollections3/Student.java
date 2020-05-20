package finalCollections3;

import java.util.List;

public class Student 
{
	private String name;
	private int id;
	private double marks;
	private long mobile;
	
	
	public Student(String name,int id,double marks,long mobile)
	{
		super();
		this.name = name;
		this.marks = marks;
		this.id = id;
		this.mobile = mobile;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		this.id = id;
	}
	public double getMarks() 
	{
		return marks;
	}
	public void setMarks()
	{
		this.marks = marks;
	}
	public long getMobile()
	{
		return mobile;
	}
	public void setMobile()
	{
		this.mobile = mobile;
	}
	@Override
	public String toString()
	{
		return this.name+"\t\t"+this.id+"\t\t"+this.marks+"\t\t"+this.mobile;
	}
	
	
	public void getStuDetails(List l)
	{
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof Student) 
			{
				System.out.println(obj);
			}
		}
	}
	
	
	/*public void getMarks(List l)
	{
		for (int i = 0; i < l.size(); i++)
		{
			Object obj = l.get(i);
			if (obj instanceof Student) 
			{
				Student st = (Student)obj;
				if (st.getMarks>60) 
				{
					System.out.println(l.get(i));
				}
			}
		}
	}*/
	

}
