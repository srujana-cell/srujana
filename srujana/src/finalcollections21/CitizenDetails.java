package finalcollections21;

import java.util.Map;
import java.util.Scanner;

public class CitizenDetails 
{
Scanner sc = new Scanner(System.in);
	
	public void addCitizen(Map m)
	{
		System.out.println("Enter City Vid:");
		
		int vid =sc.nextInt();
		
		System.out.println("Enter City Citizen:");
		
		String citizen = sc.next();
		
		m.put(vid, citizen);
	}
	
	

}
