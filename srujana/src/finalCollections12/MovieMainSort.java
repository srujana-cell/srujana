package finalCollections12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MovieMainSort 
{
	public static void main(String[] args) 
	{
		List<Movies> m = new ArrayList<Movies>();
		
		m.add(new Movies("Bahubali","Prabhas",700));
		m.add(new Movies("Bahubali2","Prabhas",800));
		m.add(new Movies("Robot","Rajnikanth",600));
		m.add(new Movies("Baghban","AmithabhBachan",500));
		m.add(new Movies("Soty","VarunDhawan",400));
		m.add(new Movies("HDKG","AkshayKumar",450));
	
		System.out.println("Name\t\tActor\t\tPrice");
		System.out.println("-----------------------------------------------------------------");
		
		Collections.sort(m);
		Iterator<Movies> itr = m.iterator();
		while (itr.hasNext()) 
		{
			 System.out.println(itr.next());
		}
		
	
	}
	

}
