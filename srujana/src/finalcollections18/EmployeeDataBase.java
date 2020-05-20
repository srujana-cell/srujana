package finalcollections18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeDataBase
{
	Scanner sc = new Scanner(System.in);
	
	public void addEmp(Map m)
	{
		System.out.println("Enter Emplopyee Id:");
		
		int id =sc.nextInt();
		
		System.out.println("Enter Employee Name:");
		
		String name = sc.next();
		
		m.put(id, name);
	}
	
	public void searchId(Map m)
	{
		System.out.println("Enter Id to be Search:");
		
		Integer id = sc.nextInt();
		
		if (m.containsKey(id)) 
		{
			System.out.println(id+"Found");
		}
		else 
		{
			System.out.println("Id not Found");
		}
	}
	
	public void disp(Map m)
	{
		Set<Entry<Integer, String>> s = m.entrySet();
		
		Iterator<Entry<Integer, String>> itr = s.iterator();
		
		System.out.println("EmpId\t\t\tEmpName");
		System.out.println("------------------------------------");
		
		while (itr.hasNext()) 
		{
			Entry<Integer, String> e = itr.next();
			
			System.out.println(e.getKey()+"\t\t\t"+e.getValue());
		}
	}
	
	public void delete(Map m)
	{
		System.out.println("Enter Id to be Delete:");
		
		Integer id = sc.nextInt();
		
		if (m.containsKey(id)) 
		{
			m.remove(id);
			System.out.println(id+"Removed");
		} 
		else 
		{
			System.out.println("Id not Removed");
		}
		
		disp(m);
	
	}
	
	public void dispId(Map m)
	{
		Set<Integer> key = m.keySet();
		
		System.out.println("Id:"+key);
	}
	
	public void dispName(Map m)
	{
		Collection<String> values = m.values();
		
		System.out.println("values:"+values);
	}

}
