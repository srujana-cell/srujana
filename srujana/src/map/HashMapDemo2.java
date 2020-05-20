package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 
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
		
		Set<Entry<Integer, String>> s = m.entrySet();
		 
		Iterator<Entry<Integer, String>> itr = s.iterator();
		
		System.err.println("Key\t\tValue");
		System.err.println("------------------------------------------");
		
		
		while (itr.hasNext()) 
		{
			Entry<Integer, String> e = itr.next();
			System.err.println(e.getKey()+"---------------"+e.getValue());
			
		}
		
		Set<Integer> key = m.keySet();
		
		List<Integer> l = new ArrayList<Integer>();
		
		Collections.sort(l);
		System.out.println("Keys :"+l);
		
		Collection<String> values = m.values();
		
		List<String> ll = new ArrayList<String>(values);
		Collections.sort(ll);
		
		System.out.println("values :"+ll);
		
	}

}
