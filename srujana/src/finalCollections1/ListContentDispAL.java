package finalCollections1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListContentDispAL 
{
	//to display only 1.integer,2.String,3.character,4.double
	
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		System.out.println("before adding objects:"+l.size());
					l.add(54);
					l.add(43.34);
					l.add('A');
					l.add(true);
					l.add("hello");
					l.add("sai");
					l.add(32);
					l.add(65.52);
					l.add(76.32f);
					l.add(null);
					l.add(54);
					l.add('B');
					l.add(132);
					l.add("shirdi");
					
		System.out.println("displaying all contents");
		System.out.println(l);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("printing only integer values");
		for (int i=0; i<l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof Integer) 
			{
				System.out.println(obj);
			}
		}
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("printing only String values");
		for(int i=0; i < l.size();i++) 
		{
			
			Object obj = l.get(i);
			if (obj instanceof String) 
			{
				String str = (String)obj;
				System.out.println(str);
			}
		}
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("printing only character values");
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof Character) 
			{
				System.out.println(obj);
			}
		}
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("printing only double values");
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof Double) 
			{
				System.out.println(obj);
			}
		}
		
					
		
	}

}
