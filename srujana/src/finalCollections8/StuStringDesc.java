package finalCollections8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StuStringDesc 
{
	public static void main(String[] args)
	{
		Set<Student> s = new TreeSet<student>(new Student());
		
		s.add(new Student("Dinga",10,65.56));
		s.add(new Student("Dingi",20,75.56));
		s.add(new Student("Binga",50,5.56));
		s.add(new Student("Bingi",30,35.56));
		s.add(new Student("Bingo",40,45.56));
		
		System.out.println("Name\t\tId\t\tMarks");
		System.out.println("----------------------------------------------");
		
		Iterator<Student> itr = s.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
