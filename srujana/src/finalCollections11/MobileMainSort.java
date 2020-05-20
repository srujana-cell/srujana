package finalCollections11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MobileMainSort 
{
	public static void main(String[] args)
	{
		Set<Mobile> s = new TreeSet<Mobile>(new Mobile());
		
		s.add(new Mobile("Lenovo",25000,3));
		s.add(new Mobile("Sony",35000,4));
		s.add(new Mobile("Redmi",12000,8));
		s.add(new Mobile("Nokia",22000,6));
		s.add(new Mobile("Oppo",15000,4));
		
		System.out.println("Name\t\tPrice\t\tRam");
		System.out.println("-------------------------------------------------------");
		
		Iterator<Mobile> itr = s.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
	}

}
