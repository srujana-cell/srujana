hpackage finalCollections2;

import java.util.LinkedList;
import java.util.List;

public class BeginLL 
{
	public static void main(String[] args) 
	{
		List l = new LinkedList();
		
		l.add(10);
		l.add("Hello");
		l.add(50);
		l.add("Navigation");
		l.add(80);
		l.add(46);
		l.add(32);
		l.add("Qsp");
		l.add("Net");
		l.add("Soap");
		l.add("Nibble");
		l.add(20);
		l.add(79);
		l.add(35);
		
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj =l.get(i);
			if (obj instanceof Integer) 
			{
				System.out.println(obj);
			}
		}
		
		System.out.println("-----------------------------------------------------------------");
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof Integer) 
			{
				Integer a = (Integer)obj;
				if (a%2==0) 
				{
					System.out.println(obj);
				}
			}
		}
		
		System.out.println("-----------------------------------------------------------------");
		for (int i = 0; i < l.size(); i++) 
		{
			Object obj = l.get(i);
			if (obj instanceof String) 
			{
				String s = (String)obj;
				if (s.startsWith("N")) 
						{
							System.out.println(s);
						}
			}
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		LinkedList ll = (LinkedList)l;
		
		System.out.println("before adding");
		System.out.println(ll);
		ll.addFirst("Net");
		ll.addLast("Nibble");
		System.out.println("after adding");
		System.out.println(ll);
		
		System.out.println("before removing");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("after removing");
		System.out.println(ll);
		
	}

}
