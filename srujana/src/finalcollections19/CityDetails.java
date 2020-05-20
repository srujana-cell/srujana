package finalcollections19;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class CityDetails 
{
	Scanner sc = new Scanner(System.in);
	
	public void addCity(Map m)
	{
		System.out.println("Enter City Name:");
		
		String name =sc.next();
		
		System.out.println("Enter City Temp:");
		
		double temp = sc.nextDouble();
		
		m.put(name, temp);
	}
	
	public void searchName(Map m)
	{
		System.out.println("Enter Name to be Search:");
		
		String name = sc.next();
		
		if (m.containsKey(name)) 
		{
			System.out.println(name+"Found");
		}
		else 
		{
			System.out.println("Name not Found");
		}
	}
	
	public void disp(Map m)
	{
		Set<Entry<String, double>> s = m.entrySet();
		
		Iterator<Entry<String, double>> itr = s.iterator();
		
		System.out.println("CityName\t\t\tCityTemp");
		System.out.println("------------------------------------");
		
		while (itr.hasNext()) 
		{
			Entry<String, double> e = itr.next();
			
			System.out.println(e.getKey()+"\t\t\t"+e.getValue());
		}
	}
	
	public void delete(Map m)
	{
		System.out.println("Enter Name to be Delete:");
		
		String Name = sc.next();
		
		if (m.containsKey(name)) 
		{
			m.remove(name);
			System.out.println(name+"Removed");
		} 
		else 
		{
			System.out.println("Name not Removed");
		}
		
		disp(m);
	
	}
	
	public void dispId(Map m)
	{
		Set<String> key = m.keySet();
		
		System.out.println("Name:"+key);
	}
	
	public void dispName(Map m)
	{
		Collection<double> values = m.values();
		
		System.out.println("values:"+values);
	}


}
