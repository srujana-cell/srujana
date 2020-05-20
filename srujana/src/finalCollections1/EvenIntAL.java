jpackage finalCollections1;

import java.util.ArrayList;
import java.util.List;

public class EvenIntAL 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(15);
		l.add(17);
		l.add(12);
		l.add(18);
		
		System.out.println("printing only even integer values");
		
		for (int i = 0; i < l.size(); i++) 
		{
			Integer itr = l.get(i);
			if (itr%2==0) 
			{
				System.out.println(itr);
				
			}
			
		}
		
	}

}