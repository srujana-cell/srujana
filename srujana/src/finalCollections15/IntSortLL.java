package finalCollections15;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class IntSortLL 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(10);
		l.add(19);
		l.add(17);
		l.add(65);
		l.add(25);
		
		System.out.println("\nBefore sort:");
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("After sort:");
		System.out.println(l);
		
	}

}
