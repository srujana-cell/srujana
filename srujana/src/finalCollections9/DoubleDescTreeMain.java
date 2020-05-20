package finalCollections9;

import java.util.Set;
import java.util.TreeSet;

import finalCollections7.TreeIntDesc;

public class DoubleDescTreeMain 
{
	public static void main(String[] args) 
	{
		Set<Double> s = new TreeSet<Double>(new DoubleTreeDesc());
		
		s.add(50.56);
		s.add(40.67);
		s.add(60.98);
		s.add(35.76);
		s.add(32.42);
		s.add(65.39);
		s.add(55.84);
		s.add(70.63);
		s.add(63.35);
		
		System.out.println(s);
		
		
		
	}

}
