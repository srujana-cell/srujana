package finalcollections21;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CitizenMap 
{
	private int vid;
	private String citizen;
	
	public CitizenMap()
	{
		
	}
	
	public CitizenMap(int vid,String citizen)
	{
		this.vid = vid;
		this.citizen = citizen;
	}
	
	public int getVid()
	{
		return vid;
	}
	
	public void setVid()
	{
		this.vid = vid;
	}
	
	public String getCitizen()
	{
		return citizen;
	}
	
	public void setCitizen()
	{
		this.citizen = citizen;
	}
	
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
	
	@Override
	public String toString()
	{
		return this.vid+"\t\t\t"+this.citizen; 
	}
	
	Iterator<CitizenMap> itr = m.iterator();
	
	while(itr.hasNext()) 
	{
		CitizenMap cm = itr.next();
		if (cm.getCitizen().startsWith("A"))
			System.out.println(cm);
	}
	
	public void getVid(Map m)
	{
		for (int i = 0; i < vid.length; i++)
		{
			Object obj = m.get(i);
			if (obj instanceof CitizenMap) 
			{
				CitizenMap cm = (CitizenMap)obj;
				if(cm.getVid().age)
				
			}
			
		}
	}
		
}
	
	
	
	
	public class CitizenMapMain 
	{
		public static void main(String[] args) 
		{
			Map<int, String> m = new HashMap<int, String>();
			
			Scanner sc = new Scanner(System.in);
			
			
	
	
	
	
	
	/*public void getCitizen(Map m)
	  {
		for (int i = 0; i < m.length; i++) 
		{
			Object obj = m.get(i);
			if (obj instance of CitizenMap) 
			{
				CitizenMap cm = (CitizenMap)obj;
				if (m.getCitizen().contains("A"))
					System.out.println(obj);
			}
			
		}
     }*/
}


