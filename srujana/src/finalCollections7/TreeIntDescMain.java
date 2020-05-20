package finalCollections7;

import java.util.Set;
import java.util.TreeSet;


public class TreeIntDescMain 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new TreeSet<Integer>(new TreeIntDesc());
		
		s.add(50);
		s.add(40);
		s.add(60);
		s.add(35);
		s.add(32);
		s.add(65);
		s.add(55);
		s.add(70);
		s.add(63);
		
		System.out.println(s);
		
		
		
	}

}
