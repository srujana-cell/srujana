package finalcollections19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import finalcollections18.EmployeeDataBase;

public class CityMapMain 
{
	public static void main(String[] args) 
	{
		Map<String, double> m = new HashMap<String, double>();
		
		Scanner sc = new Scanner(System.in);
		
		CityDetails cd = new CityDetails();
		
		while(true)
		{
			System.out.println("1.Add\n2.Display\n3.Remove\n4.SearchId\n5.DispId\n6.DispName\n7.exit");
			System.out.println("enter your choice");
			
			int ch = sc.nextInt();
			
			switch (ch) 
			{
				case 1:cd.addEmp(m);
						break;
				case 2:cd.disp(m);
						break;
				case 3:cd.delete(m);
						break;
				case 4:cd.searchName(m);
						break;
				case 5:cd.dispName(m);
						break;
				case 6:cd.dispTemp(m);
						break;
				case 7:System.exit(0);
				
				default:System.out.println("Invalid option");
						break;
			}
		}
		
	}


}
