package finalCollections14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleSortAL
{
	public static void main(String[] args) 
	{
		List<Double> l = new ArrayList<Double>();
		
		l.add(10.55);
		l.add(19.65);
		l.add(17.58);
		l.add(65.69);
		l.add(25.47);
		
		System.out.println("\nBefore sort:");
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("After sort:");
		System.out.println(l);
		
	}

}
