package finalCollections8;

import java.util.Comparator;

public class Student implements Comparator<String>
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
	
	//@Override
	public int compareTo(Student s)
	{
		//default sorting order based onId
		/*Integer i1 = this.id;
		Integer i2 = s.id;
		return i1.compareTo(i2);*/
		
		//default sorting order based on marks
		/*double d1 = this.marks;
		double d2 = s.marks;
		return d1.compareTo(d2);*/
		
		//default sorting order based on name
		String n1 = this.name;
		String n2 = s.name;
		return n1.compareTo(n2);
	}
	
	//@Override
	public int compareTo(Student s1,Student s2)
	{
		/*Integer i1 = s1.id;
		Integer i2 = s2.id;
		return i2.compareTo(i1);*/
		
		/*double d1 = s1.marks;
		double d2 = s2.marks;
		return d2.compareTo(d1);*/
		
		String n1 = s1.name;
		String n2 = s2.name;
		return n2.compareTo(n1);
	}
	
	
	
	
	
	
	
	

}
