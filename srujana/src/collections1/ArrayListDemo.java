package collections1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();//also write List l= new ArrayList();l.c AL=new AL();t.c is not reccommended
		Collection naya = new ArrayList();
		
		c.add(43);
		c.add('A');
		c.add("Hello");
		c.add(null);
		c.add(43);
		c.add('B');
		c.add(50);
		
		System.out.println(c);//[43, A, Hello, null, 43, B]
		
		c.remove(50);
		System.out.println(c);//[43, A, Hello, null, 43, B]
		
		//l.remove(new integer(50));exp will come so c.remove(obj) is used
		
		c.remove("Hello");
		System.out.println(c);//[43, A, null, 43, B]
		
		naya.add(75);
		naya.add('p');
		naya.add("jsp");
		naya.add("qsp");
		naya.add(70.23);
		naya.add('B');
		
		c.addAll(naya);
		System.out.println(c);//[43, A, null, 43, B, 75, p, jsp, qsp, 70.23, B]
		
		System.out.println(c.containsAll(naya));//true
		c.removeAll(naya);
		System.out.println(c);//[43, A, null, 43]
		
		List l = (List)c;//downcasting
		
		l.add(2,"Hello");
		
		System.out.println(l);//[43, A, Hello, null, 43]
		
		c.retainAll(naya);
		System.out.println(c);//[]
		
		
		
		

		


		
		
		
	}

}
