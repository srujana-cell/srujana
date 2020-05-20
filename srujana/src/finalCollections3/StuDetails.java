package finalCollections3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StuDetails 
{	
	public static void main(String[] args) 
	{
		List<Student> l = new ArrayList<Student>();
		
		//System.out.println("before adding objects:"+l.size());
		l.add(new Student("Dinga",40,46.45,9618118321l));
		l.add(new Student("Dingi",50,62.45,1211650123l));
		l.add(new Student("Binga",60,55.45,1234567890l));
		l.add(new Student("Sindhu",70,70.45,9876543212l));
		l.add(new Student("Sahil",80,86.45,1234561190l));
		l.add(new Student("Amar",90,50.45,1234578901l));
		l.add(new Student("Anand",100,66.45,1236787890l));
		l.add(new Student("Ahan",99,60.45,1268997890l));
		
		System.out.println("Name\t\tId\t\tMarks\t\tMobile");
		System.out.println("------------------------------------");
		
		/*for (Object obj:l) 
		{
			if (obj instanceof Student) 
				System.out.println(obj);
		}*/
		
		for (Object obj : l) 
		{
			if (obj instanceof String) 
			{
				Student st = (Student)obj;
				if (st.name.startsWith("S")&& st.marks>65) 
						System.out.println(st);
			}
		}
		
		/*Using Iterator
		
		Iterator<Student> itr = l.iterator();
		
		//ListIterator<Student> itr = l.listIterator();
		
		while (itr.hasNext()) 
		{
			Student st = itr.next();
			if(st.getMarks()>60)
				System.out.println(st);
		}*/
		
		public void getMarks(List l)
		{
			for (int i = 0; i < l.size(); i++)
			{
				Object obj = l.get(i);
				if (obj instanceof Student) 
				{
					Student st = (Student)obj;
					if (st.getMarks>60) 
					{
						System.out.println(l.get(i));
					}
				}
			}
		 }
			
		 System.out.println("To display even student objects");
		 
		 for (int i = 0; i < l.size(); i++) 
		 {
			 Object obj = l.get(i);
			 if(obj instanceof Student)
				 System.out.println(l.indexOf(i));
		 }
			
		 
			
			
		
		
	
		
		
	
	}

}
