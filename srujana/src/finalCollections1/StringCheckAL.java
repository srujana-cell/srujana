package finalCollections1;

import java.util.ArrayList;
import java.util.List;

public class StringCheckAL
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(54);
		l.add('A');
		l.add(true);
		l.add("Sweet");
		l.add("Swapnil");
		l.add(32);
		l.add("visu");
		l.add(594);
		l.add('B');
		l.add(null);
		l.add(129);
		l.add(54);
		
		System.out.println("Printing only String values starting with S");
		
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof String) 
			{
				String str = (String)obj;
				if(str.startsWith("S"))
				{
					System.out.println(str);
				}
				
			}
			
		}
		
		System.out.println("\nPrinting only String values ends with l");
		
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof String) 
			{
				String str = (String)obj;
				if(str.endsWith("l"))
					System.out.println(str);
				
			}
			
		}
		
		System.out.println("\nPrinting only even integer values");
		
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof Integer) 
			{
				Integer itr = (Integer)obj; //Downcasting
				if(itr%2==0) //autounboxing for integer
					System.out.println(itr);
			}
			
		}
		
	}

}
