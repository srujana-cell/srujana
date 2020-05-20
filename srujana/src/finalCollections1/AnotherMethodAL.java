package finalCollections1;

import java.util.ArrayList;
import java.util.List;

public class AnotherMethodAL 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(10);
		l.add(86);
		l.add(96);
		l.add("Sivam");
		l.add("Ramesh");
		l.add("Suresh");
		l.add(128);
		l.add(694);
		l.add(95);
		l.add("Sandy");
		l.add("Suraj");
		l.add(1084);
		
		for (Object obj : l) 
		{
			if (obj instanceof Integer) 
			{
				if ((Integer)obj%2==0 )
				{
					System.out.println(obj);
				}
			}
		}
		
		System.out.println("--------------------------------------------------------------");
		for (Object obj : l)
		{
			if (obj instanceof String) 
			{
				if (((String)obj).startsWith("S")) 
				{
					System.out.println(obj);
				}
			}
		}
		
		
		
		
		
		
		
	}

}
