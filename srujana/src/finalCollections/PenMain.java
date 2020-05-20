package finalCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PenMain 
{
	public static void main(String[] args) 
	{
		List<Pen> p = new ArrayList<Pen>();
		
		p.add(new Pen("Flair","Bull",10));
		p.add(new Pen("Rorito","Gel",15));
		p.add(new Pen("Reynolds","Ball",25));
		p.add(new Pen("Camline","Gel",20));
		p.add(new Pen("Link","Ball",10));
		
		System.out.println("Name\t\tType\t\tPrice");
		System.out.println("-------------------------------------------------------");
		
		Collections.sort(p,new Pen());
		
		Iterator<Pen> itr = p.iterator();
		while (itr.hasNext()) 
		{
			 System.out.println(itr.next());
		}
		
	}
}
