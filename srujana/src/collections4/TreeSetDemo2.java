package collections4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 
{
	public static void main(String[] args) 
	{
		Set<Double> s = new TreeSet<Double>(new Doubledesc());
				s.add(50.22);
				s.add(10.34);
				s.add(40.32);
				s.add(70.88);
				s.add(30.11);
				s.add(58.34);
				s.add(51.56);
				s.add(60.34);
				
		System.out.println(s);
		
	}

}
