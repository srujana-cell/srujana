package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(10,"Hello");
		m.put(23, "world");
		m.put(34, "bindu");
		m.put(78, "qsp");
		m.put(88, "jsp");
		m.put(77, "qsp");
		m.put(98, "jsp");
		m.put(76, "dinesh");
		
		System.err.println(m);
		
		Object obj = m.put(23, "mohit");
		System.err.println(m);
		
		System.err.println("obj="+obj);
		System.err.println(m.containsKey(34));
		System.err.println(m.containsValue("qsp"));
		System.err.println();
		
		
		
	
				
				
				
				
				
				
				
				h
		
	}

}
